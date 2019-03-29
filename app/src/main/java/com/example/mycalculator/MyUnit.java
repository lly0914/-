package com.example.mycalculator;

import android.content.Intent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyUnit {
    int[][] fhl = new int[20][4];
    int[][] nlp = new int[20][4];
    Double[][] dp = new Double[20][4];
    String[] grade = new String[20];
    Double[][] zwtqq = new Double[20][4];
    int[][]mix = new int[20][4];
    int[][] ldt = new int[20][4];
    String[] bmi_score = new String[4];
    int[] score = new int[20];
    int[] bmi_s = new int[4];
    MyUnit(){
        bmi_s[0] = 100;
        bmi_s[1] = 80;
        bmi_s[2] = 80;
        bmi_s[3] = 60;
        score[0] = 100;
        score[1] = 95;
        score[2] = 90;
        score[3] = 85;
        score[4] = 80;
        score[5] = 78;
        score[6] = 76;
        score[7] = 74;
        score[8] = 72;
        score[9] = 70;
        score[10] =68;
        score[11] = 66;
        score[12] = 64;
        score[13] = 62;
        score[14] = 60;
        score[15] = 50;
        score[16] = 40;
        score[17] = 30;
        score[18] = 20;
        score[19] = 10;
        grade[0] = "100";
        grade[1] = "95";
        grade[2] = "90";
        grade[3] = "85";
        grade[4] = "80";
        grade[5] = "78";
        grade[6] = "76";
        grade[7] = "74";
        grade[8] = "72";
        grade[9] = "70";
        grade[10] = "68";
        grade[11] = "66";
        grade[12] = "64";
        grade[13] = "62";
        grade[14] = "60";
        grade[15] = "50";
        grade[16] = "40";
        grade[17] = "30";
        grade[18] = "20";
        grade[19] = "10";

        fhl[0][0] = 5040;
        fhl[0][1] = 5140;
        fhl[0][2] = 3400;
        fhl[0][3] = 3450;
        fhl[1][0] = 4920;
        fhl[1][1] = 5020;
        fhl[1][2] = 3350;
        fhl[1][3] = 3400;
        fhl[2][0] = 4800;
        fhl[2][1] = 4900;
        fhl[2][2] = 3300;
        fhl[2][3] = 3350;
        fhl[3][0] = 4550;
        fhl[3][1] = 4650;
        fhl[3][2] = 3150;
        fhl[3][3] = 3200;
        fhl[4][0] = 4300;
        fhl[4][1] = 4400;
        fhl[4][2] = 3000;
        fhl[4][3] = 3020;
        fhl[5][0] = 4180;
        fhl[5][1] = 4280;
        fhl[5][2] = 2900;
        fhl[5][3] = 2950;
        fhl[6][0] = 4060;
        fhl[6][1] = 4160;
        fhl[6][2] = 2800;
        fhl[6][3] = 2850;
        fhl[7][0] = 3940;
        fhl[7][1] = 4040;
        fhl[7][2] = 2700;
        fhl[7][3] = 2750;
        fhl[8][0] = 3820;
        fhl[8][1] = 3920;
        fhl[8][2] = 2600;
        fhl[8][3] = 2650;
        fhl[9][0] = 3700;
        fhl[9][1] = 3800;
        fhl[9][2] = 2500;
        fhl[9][3] = 2550;
        fhl[10][0] =3580;
        fhl[10][1] =3680;
        fhl[10][2] =2400;
        fhl[10][3] =2450;
        fhl[11][0] =3460;
        fhl[11][1] =3560;
        fhl[11][2] =2300;
        fhl[11][3] =2350;
        fhl[12][0] =3340;
        fhl[12][1] =3440;
        fhl[12][2] =2200;
        fhl[12][3] =2250;
        fhl[13][0] =3220;
        fhl[13][1] =3320;
        fhl[13][2] =2100;
        fhl[13][3] =2150;
        fhl[14][0] =3100;
        fhl[14][1] =3200;
        fhl[14][2] =2000;
        fhl[14][3] =2050;
        fhl[15][0] =2940;
        fhl[15][1] =3030;
        fhl[15][2] =1960;
        fhl[15][3] =2010;
        fhl[16][0] =2780;
        fhl[16][1] =2860;
        fhl[16][2] =1920;
        fhl[16][3] =1970;
        fhl[17][0] =2620;
        fhl[17][1] =2690;
        fhl[17][2] =1880;
        fhl[17][3] =1930;
        fhl[18][0] =2460;
        fhl[18][1] =2520;
        fhl[18][2] =1840;
        fhl[18][3] =1890;
        fhl[19][0] =2300;
        fhl[19][1] =2350;
        fhl[19][2] =1800;
        fhl[19][3] =1850;
        nlp[0][0]= 317;
        nlp[1][0]= 322;
        nlp[2][0]= 327;
        nlp[3 ][0]= 334;
        nlp[4] [0]= 342;
        nlp[5] [0]= 347;
        nlp[6] [0]= 352;
        nlp[7] [0]= 357;
        nlp[8 ][0]= 402;
        nlp[9] [0]= 407;
        nlp[10] [0]= 412;
        nlp[11][0]= 417;
        nlp[12][0]= 422;
        nlp[13][0]= 427;
        nlp[14] [0]= 432;
        nlp[15] [0]= 452;
        nlp[16] [0]= 512;
        nlp[17] [0]= 532;
        nlp[18][0]= 552;
        nlp[19] [0]= 612;

        nlp[0][1]=315;
        nlp[1][1]=320;
        nlp[2][1]=325;
        nlp[3][1]=332;
        nlp[4][1]=340;
        nlp[5][1]=345;
        nlp[6][1]=350;
        nlp[7][1]=355;
        nlp[8][1]=400;
        nlp[9][1]=405;
        nlp[10][1]=410;
        nlp[11][1]=415;
        nlp[12][1]=420;
        nlp[13][1]=425;
        nlp[14][1]=430;
        nlp[15][1]=450;
        nlp[16][1]=510;
        nlp[17][1]=530;
        nlp[18][1]=550;
        nlp[19][1]=610;


        nlp[0][2]=318;
        nlp[1][2]=324;
        nlp[2][2]=330;
        nlp[3][2]=337;
        nlp[4][2]=344;
        nlp[5][2]=349;
        nlp[6][2]=354;
        nlp[7][2]=359;
        nlp[8][2]=404;
        nlp[9][2]=409;
        nlp[10][2]=414;
        nlp[11][2]=419;
        nlp[12][2]=424;
        nlp[13][2]=429;
        nlp[14][2]=434;
        nlp[15][2]=444;
        nlp[16][2]=454;
        nlp[17][2]=504;
        nlp[18][2]=514;
        nlp[19][2]=524;


        nlp[0] [3]= 316;
        nlp[1] [3]= 322;
        nlp[2] [3]= 328;
        nlp[3][3]= 335;
        nlp[4] [3]= 342;
        nlp[5] [3]= 347;
        nlp[6] [3]= 352;
        nlp[7] [3]= 357;
        nlp[8 ][3]= 402;
        nlp[9] [3]= 407;
        nlp[10] [3]= 412;
        nlp[11] [3]= 417;
        nlp[12] [3]= 422;
        nlp[13][3]= 427;
        nlp[14] [3]= 432;
        nlp[15] [3]= 442;
        nlp[16] [3]= 452;
        nlp[17] [3]= 502;
        nlp[18][3]= 512;
        nlp[19] [3]= 522;
        dp[0] [0]= 6.7;
        dp [1][0]= 6.8;
        dp [2][0]= 6.9;
        dp[3 ][0]= 7.0;
        dp[4] [0]= 7.1;
        dp[5] [0]= 7.3;
        dp[6] [0]= 7.5;
        dp[7] [0]= 7.7;
        dp[8 ][0]= 7.9;
        dp[9] [0]= 8.1;
        dp[10] [0]= 8.3;
        dp[11] [0]= 8.5;
        dp[12] [0]= 8.7;
        dp[13][0]= 8.9;
        dp[14] [0]= 9.1;
        dp[15] [0]= 9.3;
        dp[16] [0]= 9.5;
        dp[17] [0]= 9.7;
        dp[18][0]= 9.9;
        dp[19] [0]= 10.1;



        dp[0] [1]= 6.6;
        dp[1] [1]= 6.7;
        dp[2] [1]= 6.8;
        dp[3][1]= 6.9;
        dp[4] [1]= 7.0;
        dp[5] [1]= 7.2;
        dp[6] [1]= 7.4;
        dp[7] [1]= 7.6;
        dp[8 ][1]= 7.8;
        dp[9] [1]= 8.0;
        dp[10] [1]= 8.2;
        dp[11] [1]= 8.4;
        dp[12] [1]= 8.6;
        dp[13][1]= 8.8;
        dp[14] [1]= 9.0;
        dp[15] [1]= 9.2;
        dp[16] [1]= 9.4;
        dp[17] [1]= 9.6;
        dp[18][1]= 9.8;
        dp[19] [1]= 10.0;

        dp[0] [2]= 7.5;
        dp[1] [2]= 7.6;
        dp[2] [2]= 7.7;
        dp[3][2]= 8.0;
        dp[4] [2]= 8.3;
        dp[5] [2]= 8.5;
        dp[6] [2]= 8.7;
        dp[7] [2]= 8.9;
        dp[8 ][2]= 9.1;
        dp[9] [2]= 9.3;
        dp[10] [2]= 9.5;
        dp[11] [2]= 9.7;
        dp[12] [2]= 9.9;
        dp[13][2]= 10.1;
        dp[14] [2]= 10.3;
        dp[15] [2]= 10.5;
        dp[16] [2]= 10.7;
        dp[17] [2]= 10.9;
        dp[18][2]= 11.1;
        dp[19] [2]= 11.3;


        dp[0] [3]= 7.4;
        dp[1] [3]= 7.5;
        dp[2] [3]= 7.6;
        dp[3][3]= 7.9;
        dp[4] [3]= 8.2;
        dp[5] [3]= 8.4;
        dp[6] [3]= 8.6;
        dp[7] [3]= 8.8;
        dp[8 ][3]= 9.0;
        dp[9] [3]= 9.2;
        dp[10] [3]= 9.4;
        dp[11] [3]= 9.6;
        dp[12] [3]= 9.8;
        dp[13][3]= 10.0;
        dp[14] [3]= 10.2;
        dp[15] [3]= 10.4;
        dp[16] [3]= 10.6;
        dp[17] [3]= 10.8;
        dp[18][3]= 11.0;
        dp[19] [3]= 11.2;
        ldt[0][0]= 273;
        ldt [1][0]= 268;
        ldt[2][0] = 263;
        ldt[3 ][0]= 256;
        ldt[4][0] = 248;
        ldt[5] [0]= 244;
        ldt[6] [0]= 240;
        ldt[7][0] = 236;
        ldt[8 ][0]= 232;
        ldt[9][0] = 228;
        ldt[10][0] = 224;
        ldt[11] [0]= 220;
        ldt[12][0] = 216;
        ldt[13][0]= 212;
        ldt[14][0] = 208;
        ldt[15] [0]= 203;
        ldt[16] [0]= 198;
        ldt[17][0] = 193;
        ldt[18][0]= 188;
        ldt[19] [0]= 183;



        ldt[0] [1]= 275;
        ldt[1] [1]= 270;
        ldt [2] [1]= 265;
        ldt[3] [1]= 258;
        ldt[4] [1]= 250;
        ldt[5] [1] = 246;
        ldt[6] [1] = 242;
        ldt[7] [1] = 238;
        ldt[8 ] [1]= 234;
        ldt[9] [1]= 230;
        ldt[10] [1] = 226;
        ldt[11] [1] = 222;
        ldt[12] [1]= 218;
        ldt[13] [1]= 214;
        ldt[14] [1]= 210;
        ldt[15] [1] = 205;
        ldt[16] [1] = 200;
        ldt[17] [1]= 195;
        ldt[18] [1]= 190;
        ldt[19] [1] = 185;

        ldt[0][2] = 207;
        ldt[1][2] = 201;
        ldt[2] [2]= 195;
        ldt[3][2]= 188;
        ldt[4] [2]= 181;
        ldt[5] [2]= 178;
        ldt[6][2]= 175;
        ldt[7] [2]= 172;
        ldt[8 ][2]= 169;
        ldt[9] [2]= 166;
        ldt[10][2] = 163;
        ldt[11] [2]= 160;
        ldt[12][2] = 157;
        ldt[13][2]= 154;
        ldt[14] [2]= 151;
        ldt[15] [2]= 146;
        ldt[16] [2]= 141;
        ldt[17][2] = 136;
        ldt[18][2]= 131;
        ldt[19] [2]= 126;


        ldt[0][3] = 208;
        ldt[1] [3]= 202;
        ldt[2][3] = 196;
        ldt[3][3]= 189;
        ldt[4][3] = 182;
        ldt[5] [3]= 179;
        ldt[6][3] = 176;
        ldt[7] [3]= 173;
        ldt[8 ][3]= 170;
        ldt[9][3] = 167;
        ldt[10][3]= 164;
        ldt[11] [3]= 161;
        ldt[12] [3]= 158;
        ldt[13][3]= 155;
        ldt[14] [3]= 152;
        ldt[15][3] = 147;
        ldt[16][3] = 142;
        ldt[17][3] = 137;
        ldt[18][3]= 132;
        ldt[19] [3]= 127;
        zwtqq[0][0] = 24.9;
        zwtqq[0][1] = 25.1;
        zwtqq[0][2] = 25.8;
        zwtqq[0][3] = 26.3;
        zwtqq[1][0] = 23.1;
        zwtqq[1][1] = 23.3;
        zwtqq[1][2] = 24.0;
        zwtqq[1][3] = 24.4;
        zwtqq[2][0] = 21.3;
        zwtqq[2][1] = 21.5;
        zwtqq[2][2] = 22.2;
        zwtqq[2][3] = 22.4;
        zwtqq[3][0] = 19.5;
        zwtqq[3][1] = 19.9;
        zwtqq[3][2] = 20.6;
        zwtqq[3][3] = 21.0;
        zwtqq[4][0] = 17.7;
        zwtqq[4][1] = 18.2;
        zwtqq[4][2] = 19.0;
        zwtqq[4][3] = 19.5;
        zwtqq[5][0] = 16.3;
        zwtqq[5][1] = 16.8;
        zwtqq[5][2] = 17.7;
        zwtqq[5][3] = 18.2;
        zwtqq[6][0] = 14.9;
        zwtqq[6][1] = 15.4;
        zwtqq[6][2] = 16.4;
        zwtqq[6][3] = 16.9;
        zwtqq[7][0] = 13.5;
        zwtqq[7][1] = 14.0;
        zwtqq[7][2] = 15.1;
        zwtqq[7][3] = 15.6;
        zwtqq[8][0] = 12.1;
        zwtqq[8][1] = 12.6;
        zwtqq[8][2] = 13.8;
        zwtqq[8][3] = 14.3;
        zwtqq[9][0] = 10.7;
        zwtqq[9][1] = 11.2;
        zwtqq[9][2] = 12.5;
        zwtqq[9][3] = 13.0;
        zwtqq[10][0] = 9.3;
        zwtqq[10][1] = 9.8;
        zwtqq[10][2] = 11.2;
        zwtqq[10][3] = 11.7;
        zwtqq[11][0] = 7.9;
        zwtqq[11][1] = 8.4;
        zwtqq[11][2] = 9.9;
        zwtqq[11][3] = 10.4;
        zwtqq[12][0] = 6.5;
        zwtqq[12][1] = 7.0;
        zwtqq[12][2] = 8.6;
        zwtqq[12][3] = 9.1;
        zwtqq[13][0] = 5.1;
        zwtqq[13][1] = 5.6;
        zwtqq[13][2] = 7.3;
        zwtqq[13][3] = 7.8;
        zwtqq[14][0] = 3.7;
        zwtqq[14][1] = 4.2;
        zwtqq[14][2] = 6.0;
        zwtqq[14][3] = 6.5;
        zwtqq[15][0] = 2.7;
        zwtqq[15][1] = 3.2;
        zwtqq[15][2] = 5.2;
        zwtqq[15][3] = 5.7;
        zwtqq[16][0] = 1.7;
        zwtqq[16][1] = 2.2;
        zwtqq[16][2] = 4.4;
        zwtqq[16][3] = 4.9;
        zwtqq[17][0] = 0.7;
        zwtqq[17][1] = 1.2;
        zwtqq[17][2] = 3.6;
        zwtqq[17][3] = 4.1;
        zwtqq[18][0] = -0.3;
        zwtqq[18][1] = 0.2;
        zwtqq[18][2] = 2.8;
        zwtqq[18][3] = 3.3;
        zwtqq[19][0] = -1.3;
        zwtqq[19][1] = -0.8;
        zwtqq[19][2] = 2.0;
        zwtqq[19][3] = 2.5;
        mix[0][0] = 19;
        mix[0][1] = 20;
        mix[0][2] = 56;
        mix[0][3] = 57;
        mix[1][0] = 18;
        mix[1][1] = 19;
        mix[1][2] = 54;
        mix[1][3] = 55;
        mix[2][0] = 17;
        mix[2][1] = 18;
        mix[2][2] = 52;
        mix[2][3] = 53;
        mix[3][0] = 16;
        mix[3][1] = 17;
        mix[3][2] = 49;
        mix[3][3] = 50;
        mix[4][0] = 15;
        mix[4][1] = 16;
        mix[4][2] = 46;
        mix[4][3] = 47;
        mix[5][0] = -1;
        mix[5][1] = -1;
        mix[5][2] = 44;
        mix[5][3] = 45;
        mix[6][0] = 14;
        mix[6][1] = 15;
        mix[6][2] = 42;
        mix[6][3] = 43;
        mix[7][0] = -1;
        mix[7][1] = -1;
        mix[7][2] = 40;
        mix[7][3] = 41;
        mix[8][0] = 13;
        mix[8][1] = 14;
        mix[8][2] = 38;
        mix[8][3] = 39;
        mix[9][0] = -1;
        mix[9][1] = -1;
        mix[9][2] = 36;
        mix[9][3] = 37;
        mix[10][0] = 12;
        mix[10][1] = 13;
        mix[10][2] = 34;
        mix[10][3] = 35;
        mix[11][0] = -1;
        mix[11][1] = -1;
        mix[11][2] = 32;
        mix[11][3] = 33;
        mix[12][0] = 11;
        mix[12][1] = 12;
        mix[12][2] = 30;
        mix[12][3] = 31;
        mix[13][0] = -1;
        mix[13][1] = -1;
        mix[13][2] = 28;
        mix[13][3] = 29;
        mix[14][0] = 10;
        mix[14][1] = 11;
        mix[14][2] = 26;
        mix[14][3] = 27;
        mix[15][0] = 9;
        mix[15][1] = 10;
        mix[15][2] = 24;
        mix[15][3] = 25;
        mix[16][0] = 8;
        mix[16][1] = 9;
        mix[16][2] = 22;
        mix[16][3] = 23;
        mix[17][0] = 7;
        mix[17][1] = 8;
        mix[17][2] = 20;
        mix[17][3] = 21;
        mix[18][0] = 6;
        mix[18][1] = 7;
        mix[18][2] = 18;
        mix[18][3] = 19;
        mix[19][0] = 5;
        mix[19][1] = 6;
        mix[19][2] = 16;
        mix[19][3] = 17;


    }

    public String getGrade(String key,Double value,int x){
        String m = null;
        switch (key){
            case "nlp":
                for(int i = 0;i<20;i++){
                    if(nlp[i][x]>=value){
                        m = grade[i];
                        break;
                    }
                }
                break;
            case "dp":
                for(int i = 0;i<20;i++){
                    if(dp[i][x]>=value){
                        m = grade[i];
                        break;
                    }
                }
                break;
            case "zwtqq":
                for(int i = 0;i<20;i++){
                    if(zwtqq[i][x]<=value){
                        m = grade[i];
                        break;
                    }
                }
                break;
            case "ytxs":
                for(int i = 0;i<20;i++){
                    if(mix[i][x]<=value&&mix[i][x]!=-1){
                        m = grade[i];
                        System.out.println(i);
                        break;
                    }
                }

                break;
            case "fhl":
                for(int i = 0;i<20;i++){
                    if(fhl[i][x]<=value){
                        m = grade[i];
                        System.out.println(value);
                        break;
                    }
                }
                break;
            case "bmi":
                if(x==1||x==2){
                    if(0<value&&value<=17.8){
                        m = "80";
                    }else if(17.8<value&&value<24.0){
                        m = "100";
                    }else if(24.0<=value&&value<28.0){
                        m = "80";
                    }else if(value>=28.0){
                        m = "60";
                    }
                }else if(x==3||x==4){
                    if(0<value&&value<=17.1){
                        m = "80";
                    }else if(17.1<value&&value<24.0){
                        m = "100";
                    }else if(24.0<=value&&value<28.0){
                        m = "80";
                    }else if(value>=28.0){
                        m = "60";
                    }
                }
                break;
            case "jump":
                for(int i = 0;i<20;i++){
                    if(ldt[i][x]<=value){
                        m = grade[i];
                        break;
                    }
                }
                break;

        }
        if(m==null){
            m="0";
        }
        return m;
    }

    public HashMap<String,ArrayList<String>> get_best_solution1(String key1,String key2,double lest,int x){
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        HashMap<String,ArrayList<String>> m = new HashMap<>();
        switch (key1){
            case "nlp":
                switch (key2){
                    case "dp":
                        for(int i=0;i<20;i++){
                            int q = -1;
                        for(int j=0;j<20;j++){
                            double result = score[i]*0.2+score[j]*0.2;
                            if(result>lest){
                                q = j;
                            }
                        }
                        if(q!=-1){
                            arrayList1.add(Integer.toString(nlp[i][x]));
                            arrayList2.add(Double.toString(dp[q][x]));
                        }

                    }
                    break;
                    case "zwtqq":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.2+score[j]*0.1;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Integer.toString(nlp[i][x]));
                                arrayList2.add(Double.toString(zwtqq[q][x]));
                            }

                        }
                        break;
                    case "ytxs":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.2+score[j]*0.1;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Integer.toString(nlp[i][x]));
                                arrayList2.add(Integer.toString(mix[q][x]));
                            }

                        }
                    case "jump":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.2+score[j]*0.1;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Integer.toString(nlp[i][x]));
                                arrayList2.add(Integer.toString(ldt[q][x]));
                            }

                        }
                        break;
                    case "fhl":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.2+score[j]*0.15;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Integer.toString(nlp[i][x]));
                                arrayList2.add(Integer.toString(fhl[q][x]));
                            }

                        }
                        break;
                    case "bmi":
                        for(int i=0;i<20;i++){
                            int q = -1;

                            for(int j=0;j<4;j++) {
                                double result = score[i] * 0.2 + bmi_s[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if(x ==0||x==1){
                                    if(q==1){
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("bmi≤17.8");
                                    }else if(q==2){
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    }else if(q==0){
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("17.8＜bmi≤24.0");
                                    }else{
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }else{
                                    if(q==1){
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("bmi≤17.1");
                                    }else if(q==2){
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    }else if(q==0){
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("17.1＜bmi≤24.0");
                                    }else{
                                        arrayList1.add(Integer.toString(nlp[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }


                            }
                        }
                        break;

                }
                break;
            case "dp":
                switch (key2){
                    case "nlp":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.2+score[j]*0.2;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList2.add(Integer.toString(nlp[q][x]));
                                arrayList1.add(Double.toString(dp[i][x]));
                            }

                        }
                        break;
                        case "zwtqq":
                            for(int i=0;i<20;i++){
                                    int q = -1;
                                    for(int j=0;j<20;j++){
                                        double result = score[i]*0.2+score[j]*0.1;
                                        if(result>lest){
                                            q = j;
                                        }
                                    }
                                    if(q!=-1){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                    }

                                }
                                break;
                            case "ytxs":
                                for(int i=0;i<20;i++){
                                    int q = -1;
                                    for(int j=0;j<20;j++){
                                        double result = score[i]*0.2+score[j]*0.1;
                                        if(result>lest){
                                            q = j;
                                        }
                                    }
                                    if(q!=-1){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                    }

                                }
                                break;
                            case "jump":
                                for(int i=0;i<20;i++){
                                    int q = -1;
                                    for(int j=0;j<20;j++){
                                        double result = score[i]*0.2+score[j]*0.1;
                                        if(result>lest){
                                            q = j;
                                        }
                                    }
                                    if(q!=-1){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                    }

                                }
                                break;
                            case "fhl":
                                for(int i=0;i<20;i++){
                                    int q = -1;
                                    for(int j=0;j<20;j++){
                                        double result = score[i]*0.2+score[j]*0.15;
                                        if(result>lest){
                                            q = j;
                                        }
                                    }
                                    if(q!=-1){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                    }

                                }
                                break;
                            case "bmi":
                                for(int i=0;i<20;i++){
                                    int q = -1;

                                    for(int j=0;j<4;j++) {
                                        double result = score[i] * 0.2 + bmi_s[j] * 0.15;
                                        if (result > lest) {
                                            q = j;
                                        }
                                    }
                                    if(q!=-1){
                                        if(x ==0||x==1){
                                            if(q==1){
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("bmi≤17.8");
                                            }else if(q==2){
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("24.0<bmi<28.0");
                                            }else if(q==0){
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("17.8＜bmi≤24.0");
                                            }else{
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("bmi≥28.0");
                                            }
                                        }else{
                                            if(q==1){
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("bmi≤17.1");
                                            }else if(q==2){
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("24.0<bmi<28.0");
                                            }else if(q==0){
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("17.1＜bmi≤24.0");
                                            }else{
                                                arrayList1.add(Double.toString(dp[i][x]));
                                                arrayList2.add("bmi≥28.0");
                                            }
                                        }


                                    }
                                }
                                break;

                        }

                break;
            case "zwtqq":
                switch (key2){
                    case "nlp":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.1+score[j]*0.2;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList2.add(Integer.toString(nlp[q][x]));
                                arrayList1.add(Double.toString(zwtqq[i][x]));
                            }

                        }
                        break;
                    case "dp":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.1+score[j]*0.2;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList2.add(Double.toString(dp[q][x]));
                                arrayList1.add(Double.toString(zwtqq[i][x]));
                            }

                        }
                        break;
                    case "ytxs":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.1+score[j]*0.1;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Double.toString(zwtqq[i][x]));
                                arrayList2.add(Integer.toString(mix[q][x]));
                            }

                        }
                        break;
                    case "jump":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.1+score[j]*0.1;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Double.toString(zwtqq[i][x]));
                                arrayList2.add(Integer.toString(ldt[q][x]));
                            }

                        }
                        break;
                    case "fhl":
                        for(int i=0;i<20;i++){
                            int q = -1;
                            for(int j=0;j<20;j++){
                                double result = score[i]*0.1+score[j]*0.15;
                                if(result>lest){
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                arrayList1.add(Double.toString(zwtqq[i][x]));
                                arrayList2.add(Integer.toString(fhl[q][x]));
                            }

                        }
                        break;
                    case "bmi":
                        for(int i=0;i<20;i++){
                            int q = -1;

                            for(int j=0;j<4;j++) {
                                double result = score[i] * 0.1 + bmi_s[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if(x ==0||x==1){
                                    if(q==1){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("bmi≤17.8");
                                    }else if(q==2){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    }else if(q==0){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("17.8＜bmi≤24.0");
                                    }else{
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }else{
                                    if(q==1){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("bmi≤17.1");
                                    }else if(q==2){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    }else if(q==0){
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("17.1＜bmi≤24.0");
                                    }else{
                                        arrayList1.add(Double.toString(dp[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }


                            }
                        }
                        break;

                }

                break;
            case "ytxs":
                switch (key2) {
                    case "nlp":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Integer.toString(nlp[q][x]));
                                arrayList1.add(Integer.toString(mix[i][x]));
                            }

                        }
                        break;
                    case "dp":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Double.toString(dp[q][x]));
                                arrayList1.add(Integer.toString(mix[i][x]));
                            }

                        }
                        break;
                    case "zwtqq":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Double.toString(zwtqq[q][x]));
                                arrayList1.add(Integer.toString(mix[i][x]));
                            }

                        }
                        break;
                    case "jump":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList1.add(Integer.toString(mix[i][x]));
                                arrayList2.add(Integer.toString(ldt[q][x]));
                            }

                        }
                        break;
                    case "fhl":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList1.add(Integer.toString(mix[i][x]));
                                arrayList2.add(Integer.toString(fhl[q][x]));
                            }

                        }
                        break;
                    case "bmi":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;

                            for (int j = 0; j < 4; j++) {
                                double result = score[i] * 0.1 + bmi_s[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                if (x == 0 || x == 1) {
                                    if (q == 1) {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("bmi≤17.8");
                                    } else if (q == 2) {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    } else if (q == 0) {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                } else {
                                    if (q == 1) {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("bmi≤17.1");
                                    } else if (q == 2) {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    } else if (q == 0) {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList1.add(Integer.toString(mix[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }


                            }
                        }
                        break;
                }
                break;
            case "fhl":
                switch (key2) {
                    case "nlp":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.15 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Integer.toString(nlp[q][x]));
                                arrayList1.add(Integer.toString(fhl[i][x]));
                            }

                        }
                        break;
                    case "dp":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.15 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Double.toString(dp[q][x]));
                                arrayList1.add(Integer.toString(fhl[i][x]));
                            }

                        }
                        break;
                    case "zwtqq":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.15 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Double.toString(zwtqq[q][x]));
                                arrayList1.add(Integer.toString(fhl[i][x]));
                            }

                        }
                        break;
                    case "jump":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.15 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList1.add(Integer.toString(fhl[i][x]));
                                arrayList2.add(Integer.toString(ldt[q][x]));
                            }

                        }
                        break;
                    case "ytxs":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.15 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList1.add(Integer.toString(fhl[i][x]));
                                arrayList2.add(Double.toString(mix[q][x]));
                            }

                        }
                        break;
                    case "bmi":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;

                            for (int j = 0; j < 4; j++) {
                                double result = score[i] * 0.15 + bmi_s[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                if (x == 0 || x == 1) {
                                    if (q == 1) {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("bmi≤17.8");
                                    } else if (q == 2) {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    } else if (q == 0) {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                } else {
                                    if (q == 1) {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("bmi≤17.1");
                                    } else if (q == 2) {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    } else if (q == 0) {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList1.add(Integer.toString(fhl[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }


                            }
                        }
                        break;
                }
                break;
            case "bmi":
                switch(key2){
                    case "dp":
                    for(int i=0;i<4;i++){
                        int q=-1;
                        for(int j=0;j<20;j++){
                            double result = bmi_s[i] * 0.15 + score[j] * 0.2;
                            if (result > lest) {
                                q = j;
                            }
                        }
                        if(q!=-1){
                            if (x == 0 || x == 1) {
                                if (i == 1) {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("bmi≤17.8");
                                } else if (i == 2) {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("24.0<bmi<28.0");
                                } else if (i == 0) {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("17.8＜bmi≤24.0");
                                } else {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("bmi≥28.0");
                                }
                            } else {
                                if (i == 1) {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("bmi≤17.1");
                                } else if (i == 2) {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("24.0<bmi<28.0");
                                } else if (i == 0) {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("17.1＜bmi≤24.0");
                                } else {
                                    arrayList2.add(Double.toString(dp[q][x]));
                                    arrayList1.add("bmi≥28.0");
                                }
                            }
                        }


                    }
                    break;
                    case "nlp":
                        for(int i=0;i<4;i++){
                            int q=-1;
                            for(int j=0;j<20;j++){
                                double result = bmi_s[i] * 0.15 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if (x == 0 || x == 1) {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("bmi≤17.8");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                } else {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("bmi≤17.1");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(nlp[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                }
                            }


                        }
                        break;
                    case "zwtqq":
                        for(int i=0;i<4;i++){
                            int q=-1;
                            for(int j=0;j<20;j++){
                                double result = bmi_s[i] * 0.15 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if (x == 0 || x == 1) {
                                    if (i == 1) {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("bmi≤17.8");
                                    } else if (i == 2) {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                } else {
                                    if (i == 1) {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("bmi≤17.1");
                                    } else if (i == 2) {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Double.toString(zwtqq[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                }
                            }


                        }
                        break;
                    case "ytxs":
                        for(int i=0;i<4;i++){
                            int q=-1;
                            for(int j=0;j<20;j++){
                                double result = bmi_s[i] * 0.15 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if (x == 0 || x == 1) {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("bmi≤17.8");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                } else {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("bmi≤17.1");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(mix[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                }
                            }


                        }
                        break;
                    case "fhl":
                        for(int i=0;i<4;i++){
                            int q=-1;
                            for(int j=0;j<20;j++){
                                double result = bmi_s[i] * 0.15 + score[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if (x == 0 || x == 1) {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("bmi≤17.8");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                } else {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("bmi≤17.1");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(fhl[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                }
                            }


                        }
                        break;
                    case "jump":
                        for(int i=0;i<4;i++){
                            int q=-1;
                            for(int j=0;j<20;j++){
                                double result = bmi_s[i] * 0.15 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if(q!=-1){
                                if (x == 0 || x == 1) {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("bmi≤17.8");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                } else {
                                    if (i == 1) {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("bmi≤17.1");
                                    } else if (i == 2) {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("24.0<bmi<28.0");
                                    } else if (i == 0) {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList2.add(Integer.toString(ldt[q][x]));
                                        arrayList1.add("bmi≥28.0");
                                    }
                                }
                            }


                        }
                        break;

                }
                break;
            case "jump":
                switch (key2) {
                    case "nlp":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Integer.toString(nlp[q][x]));
                                arrayList1.add(Integer.toString(ldt[i][x]));
                            }

                        }
                        break;
                    case "dp":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.2;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Double.toString(dp[q][x]));
                                arrayList1.add(Integer.toString(ldt[i][x]));
                            }

                        }
                        break;
                    case "zwtqq":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList2.add(Double.toString(zwtqq[q][x]));
                                arrayList1.add(Integer.toString(ldt[i][x]));
                            }

                        }
                        break;
                    case "fhl":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList1.add(Integer.toString(ldt[i][x]));
                                arrayList2.add(Integer.toString(fhl[q][x]));
                            }

                        }
                        break;
                    case "ytxs":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;
                            for (int j = 0; j < 20; j++) {
                                double result = score[i] * 0.1 + score[j] * 0.1;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                arrayList1.add(Integer.toString(ldt[i][x]));
                                arrayList2.add(Integer.toString(mix[q][x]));
                            }

                        }
                        break;
                    case "bmi":
                        for (int i = 0; i < 20; i++) {
                            int q = -1;

                            for (int j = 0; j < 4; j++) {
                                double result = score[i] * 0.1 + bmi_s[j] * 0.15;
                                if (result > lest) {
                                    q = j;
                                }
                            }
                            if (q != -1) {
                                if (x == 0 || x == 1) {
                                    if (q == 1) {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("bmi≤17.8");
                                    } else if (q == 2) {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    } else if (q == 0) {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("17.8＜bmi≤24.0");
                                    } else {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                } else {
                                    if (q == 1) {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("bmi≤17.1");
                                    } else if (q == 2) {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("24.0<bmi<28.0");
                                    } else if (q == 0) {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("17.1＜bmi≤24.0");
                                    } else {
                                        arrayList1.add(Integer.toString(ldt[i][x]));
                                        arrayList2.add("bmi≥28.0");
                                    }
                                }


                            }
                        }
                        break;
                }
                break;

        }
        m.put(key1,arrayList1);
        m.put(key2,arrayList2);
        return m;
    }

    public HashMap<String,ArrayList<String>> get_best_solution(String key1,String key2,double lest,int x) {
        HashMap<String,ArrayList<String>> m = new HashMap<>();
        HashMap<String,ArrayList<String>> m1 = get_best_solution1(key1,key2,lest,x);
        HashMap<String,ArrayList<String>> m2 = get_best_solution1(key2,key1,lest,x);
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for(int i = 0;i<m1.get(key1).size();i++){
            for(int j = 0;j<m2.get(key1).size();j++){
                if(m1.get(key1).get(i).equals(m2.get(key1).get(j))&&m1.get(key2).get(i).equals(m2.get(key2).get(j))){
                    arrayList1.add(m1.get(key1).get(i));
                    arrayList2.add(m1.get(key2).get(i));
                    System.out.println("各值1："+m1.get(key1).get(i)+m1.get(key2).get(i));
                }
                System.out.println("各值21："+m1.get(key1).get(i)+m1.get(key2).get(i));
                System.out.println("各值22："+m2.get(key1).get(j)+m2.get(key2).get(j));
            }
        }
        m.put(key1,arrayList1);
        m.put(key2,arrayList2);
        return m;
    }


}
