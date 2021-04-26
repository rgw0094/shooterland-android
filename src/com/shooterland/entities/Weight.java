package com.shooterland.entities;

import android.graphics.Canvas;

import com.shooterland.framework.AbstractEntity;

public class Weight extends AbstractEntity 
{
	private boolean _movingLeft;
	private int _weight;
	private int _gridX;
	private int _gridY;
	
	
	public Weight(boolean movingLeft, int weight, int gridX, int gridY)
	{
		_movingLeft = movingLeft;
		_weight = weight;
		_gridX = gridX;
		_gridY = gridY;
		
		gatherMoreShitToPush();
	}
	
	@Override
	public void draw(Canvas canvas) 
	{
		
	}

	@Override
	public boolean isDead() 
	{
		return false;
	}

	@Override
	public void update(float dt) 
	{
	}
	
	private void gatherMoreShitToPush()
	{
		for (int i = 1; i <= _weight; i++)
		{
			if (_movingLeft)
			{
				//if (gridX - i >= )
				
				//_grid.getTile(gridX - i, gridY);
			}
		}
	}

}
