package com.example.execi_pa;

import java.util.Random;

import android.graphics.Color;

public class BotoesUtil implements BotoesUtilFacade{

	private int[] colorChoices = {Color.BLACK, Color.BLUE, Color.DKGRAY, Color.GRAY, Color.CYAN,
		Color.GREEN, Color.LTGRAY, Color.RED, Color.YELLOW	
	};
	
	@Override
	public int randomizerColorButton() {
		Random gerador = new Random();
		int i = gerador.nextInt(this.colorChoices.length);
		return this.colorChoices[i];
	}

	
	
}
