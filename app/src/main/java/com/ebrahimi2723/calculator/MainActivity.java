package com.ebrahimi2723.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
float firstNum,secondNum;
boolean isFirstNum=true;
String screen_content="";
int order=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void num1(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"1";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"1";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
        }
    public void num2(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"2";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"2";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num3(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"3";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"3";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num4(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"4";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"4";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num5(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"5";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"5";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num6(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"6";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"6";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num7(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"7";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"7";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num8(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"8";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"8";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void num9(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"9";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"9";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void plus(View view) {

    order=1;
    screen_content="";
    isFirstNum=false;
    TextView screen = findViewById(R.id.result);
    screen.setText(screen_content);

    }
    public void num0(View view) {
        if (countStringIsBig(screen_content)){
            if (isFirstNum){
                screen_content=screen_content+"0";
                firstNum=Float.parseFloat(screen_content);
            }else{
                screen_content=screen_content+"0";
                secondNum=Float.parseFloat(screen_content);
            }
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
//        Log.i(" firstNum:",firstNum+"");
//        Log.i(" secondNum:",secondNum+"");
    }
    public void negative(View view) {
        if (screen_content.isEmpty()){
            screen_content=screen_content+"-";
        }else {
            order=2;
            screen_content="";
            isFirstNum=false;
            TextView screen = findViewById(R.id.result);
            screen.setText(screen_content);
        }
    }
    public void multi(View view) {
        order=3;
        screen_content="";
        isFirstNum=false;
        TextView screen = findViewById(R.id.result);
        screen.setText(screen_content);
    }
    public void assign(View view) {
        float result = 0;
        String finalResult="";
        switch (order){
            case 1:
                result= firstNum+secondNum;
                firstNum=result;
                finalResult=removeZero(result);

               break;
            case 2:
                result=firstNum-secondNum;
                firstNum=result;
                finalResult=removeZero(result);
                break;
            case 3:
                result= firstNum * secondNum;
                firstNum=result;
                finalResult=removeZero(result);
                break;
            case  4:
                result=firstNum/secondNum;
                firstNum=result;
                finalResult=removeZero(result);
                break;
        }
        TextView screen = findViewById(R.id.result);
        screen.setText(finalResult);
    }
    public void divide(View view) {
        order=4;
        screen_content="";
        isFirstNum=false;
        TextView screen = findViewById(R.id.result);
        screen.setText(screen_content);
    }
    public void clear(View view) {
        screen_content="";
        firstNum=0;
        secondNum=0;
        isFirstNum=true;
        TextView screen = findViewById(R.id.result);
        screen.setText(screen_content);

    }
    public void point(View view) {
        if (findPoint()==false && !screen_content.isEmpty()){
            if (countStringIsBig(screen_content)){
                if (isFirstNum){
                    screen_content=screen_content+".";
                    firstNum=Float.parseFloat(screen_content);
                }else{
                    screen_content=screen_content+".";
                    secondNum=Float.parseFloat(screen_content);
                }
                TextView screen = findViewById(R.id.result);
                screen.setText(screen_content);
            }
//        Log.i(" secondNum:",secondNum+"");
        }
//        Log.i(" firstNum:",firstNum+"");
    }
    public boolean  countStringIsBig(String s){

            int count = 0;
            //Counts each character except space
            for(int i = 0; i < screen_content.length(); i++) {
                if(screen_content.charAt(i) != ' ')
                    count++;
            }

            //Displays the total number of characters present in the given string
        if (count <= 9){
            return true;
         }
        else {
            return false;
         }
}
    public boolean findPoint(){
        if(screen_content.indexOf(".")!=-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  String removeZero(float value){
        DecimalFormat formatter = new DecimalFormat("0");
        DecimalFormat decimalFormatter = new DecimalFormat("0.0000000");
        String s;
        if (value % 1L > 0L) s = decimalFormatter.format(value);
        else s = formatter.format(value);
        return s;
    }
}