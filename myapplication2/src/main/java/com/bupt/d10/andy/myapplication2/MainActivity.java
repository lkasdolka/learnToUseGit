package com.bupt.d10.andy.myapplication2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private ImageView drawDots;
    private DisplayMetrics dm;
    private final String TAG = "MainActivity";
    private TextView metricsHeight;
    private TextView metricsWidth;
    private TextView metricsDensity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metricsHeight = (TextView)this.findViewById(R.id.textView3);
        metricsWidth = (TextView)this.findViewById(R.id.textView4);
        metricsDensity = (TextView)this.findViewById(R.id.textView5);
        drawDots = (ImageView)this.findViewById(R.id.imageView);
        Bitmap bitMap = Bitmap.createBitmap(1000,1000, Bitmap.Config.ARGB_8888);
        bitMap = bitMap.copy(bitMap.getConfig(),true);
        Canvas grid = new Canvas(bitMap);
        grid.drawColor(Color.WHITE);
        Paint paint2 = new Paint();
        paint2.setColor(Color.GRAY);
        grid.drawRect(100,0,200,500,paint2);
        Paint paint = new Paint();//要画的图形的对象
        int imageHeight = drawDots.getHeight();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10f);
//        paint.sets;
//        paint.setstroke
        int width = 200;
        grid.drawCircle(150f,150f,20f,paint);

//        for(int i=0;i<10;i++){
//            grid.drawCircle((float)(i+.5)/10*width,imageHeight/2,3,paint);
//        }
        drawDots.setImageBitmap(bitMap);


        //get device's resolution and density

//        dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//        metricsHeight.setText(dm.heightPixels+"");
//        metricsWidth.setText(dm.widthPixels+"");
//        metricsDensity.setText(dm.density+"");
//        Log.i(TAG, "-->dm height:" + dm.heightPixels);
//        Log.i(TAG, "-->dm width:" + dm.widthPixels);
//        Log.i(TAG, "-->dm density:" + dm.density);
//        Log.i(TAG,"-->dm height:"+dm.widthPixels);
//        Log.i(TAG,"-->dm height:"+dm.widthPixels);
//        Log.i(TAG,"-->dm height:"+dm.widthPixels);




    }
    private class ViewHolder{
        ImageView view1;
        ImageView view2;
        ImageView view3;
        ImageView view4;
    }
//    public View getView(int position,View convertView,ViewGroup parent){
//        ViewHolder vh;
//        if(convertView == null){
//            LayoutInflater inflater = getLayoutInflater();
//            convertView = inflater.inflate(R.layout.app_gallery_item, null);
//            vh = new ViewHolder();
//            vh.view1 = (ImageView) convertView.findViewById(R.id.view1);
//            vh.view2 = (ImageView) convertView.findViewById(R.id.view2);
//            vh.view3= (ImageView) convertView.findViewById(R.id.view3);
//            vh.view4 = (ImageView) convertView.findViewById(R.id.view4);
//            convertView.setTag(vh);
//        }else{
//            vh = (ViewHolder)convertView.getTag();
//        }
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
