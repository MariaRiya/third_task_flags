package com.example.thirdtaskflags

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class SwitzerlandFlag (internal var context: Context, attrs: AttributeSet)
    : View(context, attrs) {

    var rectH = Rect()
    var rectV = Rect()
    val paint = Paint().apply {
        style = Paint.Style.FILL
        color = Color.YELLOW
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawRect(rectV, paint)
        canvas.drawRect(rectH, paint)


    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
//        Log.d("STICK", "Width w= " + w + " height h=" + h)
        super.onSizeChanged(w, h, oldw, oldh)

        val view_width = w
        val view_height = h

        val radius = (view_height / 7) / 2

        val startY = view_height /2

        val startX = view_width / 3

        rectH = Rect(0, startY - radius, view_width, startY + radius)

        rectV = Rect(startX - radius, 0, startX + radius, view_height)

    }

}