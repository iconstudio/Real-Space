package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.MemoryImageSource;

public final class memimage extends MemoryImageSource
{

    public memimage(int w, int h, ColorModel cm, byte[] pix, int off, int scan) {
		super(w, h, cm, pix, off, scan);
	}

	public final synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        HNSM = imageconsumer;
        super.addConsumer(imageconsumer);
    }

    public ImageConsumer HNSM;
}
