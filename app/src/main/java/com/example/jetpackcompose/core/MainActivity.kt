@file:Suppress("UNUSED_PARAMETER")

package com.example.jetpackcompose.core

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackcompose.R
import com.example.jetpackcompose.animation.Animation1Activity
import com.example.jetpackcompose.animation.Animation2Activity
import com.example.jetpackcompose.animation.ListAnimationActivity
import com.example.jetpackcompose.animation.TextAnimationActivity
import com.example.jetpackcompose.customview.CustomViewActivity
import com.example.jetpackcompose.customview.CustomViewPaintActivity
import com.example.jetpackcompose.customview.MeasuringScaleActivity
import com.example.jetpackcompose.customview.ZoomableActivity
import com.example.jetpackcompose.image.ImageActivity
import com.example.jetpackcompose.interop.ComposeInClassicAndroidActivity
import com.example.jetpackcompose.layout.ConstraintLayoutActivity
import com.example.jetpackcompose.layout.LayoutModifierActivity
import com.example.jetpackcompose.layout.ViewLayoutConfigurationsActivity
import com.example.jetpackcompose.material.AlertDialogActivity
import com.example.jetpackcompose.material.BottomNavigationActivity
import com.example.jetpackcompose.material.ButtonActivity
import com.example.jetpackcompose.material.DrawerAppActivity
import com.example.jetpackcompose.material.FixedActionButtonActivity
import com.example.jetpackcompose.material.FlowRowActivity
import com.example.jetpackcompose.material.MaterialActivity
import com.example.jetpackcompose.material.ShadowActivity
import com.example.jetpackcompose.scrollers.HorizontalScrollableActivity
import com.example.jetpackcompose.scrollers.VerticalScrollableActivity
import com.example.jetpackcompose.stack.StackActivity
import com.example.jetpackcompose.state.ProcessDeathActivity
import com.example.jetpackcompose.state.StateActivity
import com.example.jetpackcompose.state.backpress.BackPressActivity
import com.example.jetpackcompose.state.coroutine.CoroutineFlowActivity
import com.example.jetpackcompose.state.livedata.LiveDataActivity
import com.example.jetpackcompose.text.CustomTextActivity
import com.example.jetpackcompose.text.SimpleTextActivity
import com.example.jetpackcompose.text.TextFieldActivity
import com.example.jetpackcompose.theme.DarkModeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Junior patch begin
        showAlerDialog()
        // Junior patch end
    }

    //Junior patch begin
    private fun showAlerDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Jetpack Program")
        builder.setMessage("Welcome to Junior's App\n Would you like enter Program?")
        //builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton(android.R.string.no) { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.no, Toast.LENGTH_SHORT).show()
            finish()
        }
        builder.show()
    }
    // Junior patch end

    fun startSimpleTextExample(view: View) {
        startActivity(Intent(this, SimpleTextActivity::class.java))
        Toast.makeText(this, "SimpleTextActivity", Toast.LENGTH_SHORT).show()
    }

    fun startCustomTextExample(view: View) {
        startActivity(Intent(this, CustomTextActivity::class.java))
        Toast.makeText(this, "CustomTextActivity", Toast.LENGTH_SHORT).show()
    }

    fun startVerticalScrollableExample(view: View) {
        startActivity(Intent(this, VerticalScrollableActivity::class.java))
        Toast.makeText(this, "VerticalScrollableActivity", Toast.LENGTH_SHORT).show()
    }

    fun startHorizontalScrollableExample(view: View) {
        startActivity(Intent(this, HorizontalScrollableActivity::class.java))
        Toast.makeText(this, "HorizontalScrollableActivity", Toast.LENGTH_SHORT).show()
    }

    fun starLoadImageExample(view: View) {
        startActivity(Intent(this, ImageActivity::class.java))
        Toast.makeText(this, "ImageActivity", Toast.LENGTH_SHORT).show()
    }

    // The Table API has been removed in dev11 update. Removing this example until there is a 
    // better alternative available
//    fun startGridExample(view: View) {
//        startActivity(Intent(this, GridLayoutActivity::class.java))
//    }

    fun startAlertDialogExample(view: View) {
        startActivity(Intent(this, AlertDialogActivity::class.java))
        Toast.makeText(this, "AlertDialogActivity", Toast.LENGTH_SHORT).show()
    }

    fun startDrawerExample(view: View) {
        startActivity(Intent(this, DrawerAppActivity::class.java))
        Toast.makeText(this, "DrawerAppActivity", Toast.LENGTH_SHORT).show()
    }

    fun startButtonsExample(view: View) {
        startActivity(Intent(this, ButtonActivity::class.java))
        Toast.makeText(this, "ButtonActivity", Toast.LENGTH_SHORT).show()
    }

    fun startStateExample(view: View) {
        startActivity(Intent(this, StateActivity::class.java))
        Toast.makeText(this, "StateActivity", Toast.LENGTH_SHORT).show()
    }

    fun startCustomViewExample(view: View) {
        startActivity(Intent(this, CustomViewActivity::class.java))
        Toast.makeText(this, "CustomViewActivity", Toast.LENGTH_SHORT).show()
    }

    fun startCustomViewPaintExample(view: View) {
        startActivity(Intent(this, CustomViewPaintActivity::class.java))
        Toast.makeText(this, "CustomViewPaintActivity", Toast.LENGTH_SHORT).show()
    }

    fun startAutofillTextExample(view: View) {
        startActivity(Intent(this, TextFieldActivity::class.java))
        Toast.makeText(this, "TextFieldActivity", Toast.LENGTH_SHORT).show()
    }

    fun startStackExample(view: View) {
        startActivity(Intent(this, StackActivity::class.java))
        Toast.makeText(this, "StackActivity", Toast.LENGTH_SHORT).show()
    }

    fun startViewAlignExample(view: View) {
        startActivity(Intent(this, ViewLayoutConfigurationsActivity::class.java))
        Toast.makeText(this, "ViewLayoutConfigurationsActivity", Toast.LENGTH_SHORT).show()
    }

    fun startMaterialDesignExample(view: View) {
        startActivity(Intent(this, MaterialActivity::class.java))
        Toast.makeText(this, "MaterialActivity", Toast.LENGTH_SHORT).show()
    }

    fun startFixedActionButtonExample(view: View) {
        startActivity(Intent(this, FixedActionButtonActivity::class.java))
        Toast.makeText(this, "FixedActionButtonActivity", Toast.LENGTH_SHORT).show()
    }

    fun startConstraintLayoutExample(view: View) {
        startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        Toast.makeText(this, "ConstraintLayoutActivity", Toast.LENGTH_SHORT).show()
    }

    fun startBottomNavigationExample(view: View) {
        startActivity(Intent(this, BottomNavigationActivity::class.java))
        Toast.makeText(this, "BottomNavigationActivity", Toast.LENGTH_SHORT).show()
    }

    fun startAnimation1Example(view: View) {
        startActivity(Intent(this, Animation1Activity::class.java))
        Toast.makeText(this, "Animation1Activity", Toast.LENGTH_SHORT).show()
    }

    fun startAnimation2Example(view: View) {
        startActivity(Intent(this, Animation2Activity::class.java))
        Toast.makeText(this, "Animation2Activity", Toast.LENGTH_SHORT).show()
    }

    fun startTextInlineContentExample(view: View) {
        startActivity(Intent(this, TextAnimationActivity::class.java))
        Toast.makeText(this, "TextAnimationActivity", Toast.LENGTH_SHORT).show()
    }

    fun startListAnimation(view: View) {
        startActivity(Intent(this, ListAnimationActivity::class.java))
        Toast.makeText(this, "ListAnimationActivity", Toast.LENGTH_SHORT).show()
    }

    fun startThemeExample(view: View) {
        startActivity(Intent(this, DarkModeActivity::class.java))
        Toast.makeText(this, "DarkModeActivity", Toast.LENGTH_SHORT).show()
    }

    fun startLayoutModifierExample(view: View) {
        startActivity(Intent(this, LayoutModifierActivity::class.java))
        Toast.makeText(this, "LayoutModifierActivity", Toast.LENGTH_SHORT).show()
    }

    fun startProcessDeathExample(view: View) {
        startActivity(Intent(this, ProcessDeathActivity::class.java))
        Toast.makeText(this, "ProcessDeathActivity", Toast.LENGTH_SHORT).show()
    }

    fun startLiveDataExample(view: View) {
        startActivity(Intent(this, LiveDataActivity::class.java))
        Toast.makeText(this, "LiveDataActivity", Toast.LENGTH_SHORT).show()
    }

    fun startFlowRowExample(view: View) {
        startActivity(Intent(this, FlowRowActivity::class.java))
        Toast.makeText(this, "FlowRowActivity", Toast.LENGTH_SHORT).show()
    }

    fun startShadowExample(view: View) {
        startActivity(Intent(this, ShadowActivity::class.java))
        Toast.makeText(this, "ShadowActivity", Toast.LENGTH_SHORT).show()
    }

    fun startCoroutineFlowExample(view: View) {
        startActivity(Intent(this, CoroutineFlowActivity::class.java))
        Toast.makeText(this, "CoroutineFlowActivity", Toast.LENGTH_SHORT).show()
    }

    fun startComposeWithClassicAndroidExample(view: View) {
        startActivity(Intent(this, ComposeInClassicAndroidActivity::class.java))
        Toast.makeText(this, "ComposeInClassicAndroidActivity", Toast.LENGTH_SHORT).show()
    }

    fun startMeasuringScaleExample(view: View) {
        startActivity(Intent(this, MeasuringScaleActivity::class.java))
        Toast.makeText(this, "MeasuringScaleActivity", Toast.LENGTH_SHORT).show()
    }

    fun startBackPressExample(view: View) {
        startActivity(Intent(this, BackPressActivity::class.java))
        Toast.makeText(this, "BackPressActivity", Toast.LENGTH_SHORT).show()
    }

    fun startZoomableExample(view: View) {
        startActivity(Intent(this, ZoomableActivity::class.java))
        Toast.makeText(this, "ZoomableActivity", Toast.LENGTH_SHORT).show()
    }
}
