package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y


final class gamecamera extends oGameObject
{

    gamecamera(gameapp gameapp1)
    {
        super(gameapp1);
    }

    protected final void J()
    {
        super.initialize(null, 11, 0, 0, 0, true);
        I(0.0F, 0.0F, true, 0.0F, 0.0F);
        HNSM = -1;
    }

    final void I()
    {
        if(super.owner.Mission.O == 1001 && super.Q == null)
            if(HNSM == -1)
                HNSM = 50;
            else
            if(HNSM > 0)
            {
                HNSM--;
            } else
            {
                oGameObjectlist oGameObjectlist1;
                if(Math.random() < 0.5D)
                    oGameObjectlist1 = super.owner.vZ;
                else
                    oGameObjectlist1 = super.owner.wZ;
                int i = oGameObjectlist1.C;
                if(i > 0)
                {
                    int j = (int)(Math.random() * 0.99900000000000011D * (double)i);
                    I(j < 0 || j >= oGameObjectlist1.C ? null : oGameObjectlist1.Z[j], true, 30F, 0.02F);
                }
                HNSM = -1;
            }
        if(super.Q != null)
        {
            if(super.Q.e != 1)
            {
                super.Q = null;
                super.P = false;
                I(super.J, super.S, super.f);
            } else
            if(!super.Q.v || !super.Q.w)
                super.I();
            else
            if(F)
            {
                super.J = super.Q.J;
                super.S = super.Q.S;
                super.K = super.Q.K;
                super.L = super.Q.L;
            } else
            {
                B();
            }
        } else
        {
            super.I();
        }
        super.owner.WC = (int)(-super.J) + ((gamebase) (super.owner)).view_width / 2;
        super.owner.XC = (int)(-super.S) + ((gamebase) (super.owner)).view_height / 2;
    }

    final void I(float f, float f1, boolean flag, float f2, float f3)
    {
        F = flag;
        super.Q = null;
        if(flag)
        {
            I(f, f1, false);
            if(super.owner.Starfield != null)
                super.owner.Starfield.initialize();
        } else
        {
            I(super.J, super.S, null, f, f1, f2, f3, true, false);
        }
        super.owner.WC = (int)(-super.J) + ((gamebase) (super.owner)).view_width / 2;
        super.owner.XC = (int)(-super.S) + ((gamebase) (super.owner)).view_height / 2;
    }

    final void I(oGameObject oGameObject1, boolean flag, float f, float f1)
    {
        F = flag;
        super.Q = oGameObject1;
        if(F)
        {
            float f2 = super.Q.J - super.J;
            float f3 = super.Q.S - super.S;
            super.J = super.Q.J;
            super.S = super.Q.S;
            super.K = 0.0F;
            super.L = 0.0F;
            if(f2 * f2 + f3 * f3 > 16F && super.owner.Starfield != null)
                super.owner.Starfield.initialize();
        } else
        {
            I(super.J, super.S, oGameObject1, 0.0F, 0.0F, f, f1, true, false);
        }
        super.owner.WC = (int)(-super.J) + ((gamebase) (super.owner)).view_width / 2;
        super.owner.XC = (int)(-super.S) + ((gamebase) (super.owner)).view_height / 2;
    }

    final boolean A()
    {
        if(!super.P)
            return true;
        float f = super.J - super.R;
        float f1 = super.S - super.T;
        return f * f + f1 * f1 < 2.0F;
    }

    boolean F;
    int HNSM;
}
