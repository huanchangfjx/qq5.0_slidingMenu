package com.example.zhy_slidingmenu;  
  
import android.content.Context;  
import android.util.AttributeSet;  
import android.util.Log;  
import android.widget.LinearLayout;  
  
public class MyLinearLayout extends LinearLayout  
{  
  
    public MyLinearLayout(Context context, AttributeSet attrs)  
    {  
        super(context, attrs);  
        Log.e("TAG", "MyLinearLayout");  
        setChildrenDrawingOrderEnabled(true);  
    }  
  
    @Override  
    protected int getChildDrawingOrder(int childCount, int i)  
    {  
    	//用于控制布局中绘画的顺序
    	if (i == 0)  
    	{
            return 1;
    	}
    	else if (i == 1)  
    	{
    		return 0;
    	}
             
        return super.getChildDrawingOrder(childCount, i);  
  
    }  
  
}  