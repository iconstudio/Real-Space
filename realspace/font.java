package realspace;

final class Font
{
	public Font(int i, int j, int k)
	{
		C = i;
		B = j;
		charAt = k;
		I = new Sprite[D];
		Z = new int[D];

		for (int l = 0; l < D; l++)
		{
			I[l] = null;
			Z[l] = -1;
		}
	}

	final int I(char ac[], int i, int j)
	{
		int k = 0;
		for (int l = 0; l < j;)
		{
			char c = ac[i];

			if (c > 0 && c < D)
			{
				Sprite sprite1 = I[c];

				if (sprite1 != null)
					k += sprite1.C + B;
				else if (c == ' ')
					k += B * 2;
				else
					k += B;
			}
			else
			{
				k += B;
			}

			l++;
			i++;
		}

		return k;
	}

	final int I(String s)
	{
		int i = 0;
		int j = s.length();
		for (int k = 0; k < j; k++)
		{
			char c = s.charAt(k);

			if (c > 0 && c < D)
			{
				Sprite sprite1 = I[c];

				if (sprite1 != null)
					i += sprite1.C + B;
				else if (c == ' ')
					i += B * 2;
				else
					i += B;
			}
			else
			{
				i += B;
			}
		}

		return i;
	}

	Sprite I[];
	int Z[];
	int C;
	int B;
	int charAt;
	static int D = 128;
}
