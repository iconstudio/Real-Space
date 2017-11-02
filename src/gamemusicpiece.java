package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import sun.audio.AudioStream;

class gamemusicpiece
{

    gamemusicpiece(gameapp gameapp, String s)
    {
        URL url;
        try
        {
            url = new URL(gameapp.getCodeBase(), s);
        }
        catch(MalformedURLException _ex)
        {
            System.out.println("bad url");
            return;
        }
        try
        {
            AudioStream audiostream = new AudioStream(url.openStream());
            Z = audiostream.getLength();
            I = new byte[Z];
            audiostream.read(I, 0, Z);
            audiostream.close();
            return;
        }
        catch(IOException _ex)
        {
            System.out.println("Failed to load sound file " + s);
        }
    }

    byte I[];
    int Z;
}
