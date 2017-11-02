package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import sun.audio.*;

class gamemusicseq
{

    gamemusicseq(int i)
    {
        arraycopy = 0;
        HNSM = i;
        player = new gamemusicpiece[i];
        out = false;
        println = null;
    }

    final void I(gamemusicpiece gamemusicpiece1)
    {
        if(arraycopy < HNSM)
        {
            player[arraycopy] = gamemusicpiece1;
            arraycopy++;
        }
    }

    final void I()
    {
        int i = 0;
        for(int j = 0; j < arraycopy; j++)
            i += player[j].Z;

        byte abyte0[] = new byte[i];
        int k = 0;
        for(int l = 0; l < arraycopy; l++)
        {
            gamemusicpiece gamemusicpiece1 = player[l];
            System.arraycopy(gamemusicpiece1.I, 0, abyte0, k, gamemusicpiece1.Z);
            k += gamemusicpiece1.Z;
        }

        try
        {
            AudioData audiodata = new AudioData(abyte0);
            println = new ContinuousAudioDataStream(audiodata);
        }
        catch(Exception _ex)
        {
            System.out.println("ERROR: exception occured when trying to prepare music");
            println = null;
        }
        for(int i1 = 0; i1 < arraycopy; i1++)
            player[i1] = null;

        arraycopy = 0;
    }

    final void I(boolean flag)
    {
        if(println != null)
            if(flag)
            {
                if(!out)
                {
                    AudioPlayer.player.start(println);
                    out = true;
                    return;
                }
            } else
            {
                AudioPlayer.player.stop(println);
                out = false;
            }
    }

    int HNSM;
    int arraycopy;
    boolean out;
    gamemusicpiece player[];
    ContinuousAudioDataStream println;
}
