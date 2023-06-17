package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculateActivity extends AppCompatActivity {

    private Button btn_9;
    private Button btn_8;
    private Button btn_7;
    private Button btn_6;
    private Button btn_5;
    private Button btn_4;
    private Button btn_3;
    private Button btn_2;
    private Button btn_1;
    private Button btn_0;
    private Button btn_c;
    private Button btn_p;
    private Button btn_b;
    private Button btn_m;
    private Button btn_d;
    private Button btn_a;
    private Button btn_s;
    private Button btn_pp;
    private Button btn_ad;
    private Button btn_e;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        tv1 = findViewById(R.id.tv1);

        btn_9 = findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("9");
                } else {
                    tv1.setText(tv1.getText() + "9");
                }
            }
        });

        btn_8 = findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("8");
                } else {
                    tv1.setText(tv1.getText() + "8");
                }
            }
        });

        btn_7 = findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("7");
                } else {
                    tv1.setText(tv1.getText() + "7");
                }
            }
        });

        btn_6 = findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("6");
                } else {
                    tv1.setText(tv1.getText() + "6");
                }
            }
        });
//
        btn_5 = findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("5");
                } else {
                    tv1.setText(tv1.getText() + "5");
                }
            }
        });

        btn_4 = findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("4");
                } else {
                    tv1.setText(tv1.getText() + "4");
                }
            }
        });

        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("3");
                } else {
                    tv1.setText(tv1.getText() + "3");
                }
            }
        });

        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("2");
                } else {
                    tv1.setText(tv1.getText() + "2");
                }
            }
        });

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("1");
                } else {
                    tv1.setText(tv1.getText() + "1");
                }
            }
        });

        btn_0 = findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().equals("0")) {
                    tv1.setText("0");
                } else {
                    tv1.setText(tv1.getText() + "0");
                }
            }
        });

        btn_c = findViewById(R.id.btn_c);
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("0");
            }
        });

        btn_p = findViewById(R.id.btn_p);
        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "%");
            }
        });

        btn_b = findViewById(R.id.btn_b);
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence cs = tv1.getText();
                tv1.setText(cs.subSequence(0, cs.length() - 1));
            }
        });

        btn_m = findViewById(R.id.btn_m);
        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "*");
            }
        });

        btn_d = findViewById(R.id.btn_d);
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "/");
            }
        });

        btn_a = findViewById(R.id.btn_a);
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "+");
            }
        });

        btn_s = findViewById(R.id.btn_s);
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "-");
            }
        });

        btn_pp = findViewById(R.id.btn_pp);
        btn_pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + ".");
            }
        });

        btn_ad = findViewById(R.id.btn_ad);
        btn_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("-(" + tv1.getText() + ")");
            }
        });

        btn_e = findViewById(R.id.btn_e);
        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "=");
                CharSequence chas = tv1.getText();
                String str = chas.toString();
                int i = 0, j, k = 0, m = 0;
                double result = 0.00;
                double num1, num2 = 0.00;
                while (m < str.length()) {
                    j = i;
                    num1 = 0.00;
                    if (j < str.length()) {
                        while (((Character.isDigit(str.charAt(j)))) || (str.charAt(j) == '.')) {
                            if (str.charAt(j) != '.') {
                                if (num1 == 0)
                                    num1 += Double.parseDouble(String.valueOf(str.charAt(j)));
                                else
                                    num1 = num1 * 10 + Double.parseDouble(String.valueOf(str.charAt(j)));
                                j++;
                            } else {
                                j++;
                                int wdnmd = 1;
                                while (Character.isDigit(str.charAt(j))) {
                                    double crazy = Double.parseDouble(String.valueOf(str.charAt(j)));
                                    int haha = wdnmd;
                                    while (haha > 0) {
                                        crazy /= 10;
                                        haha--;
                                    }
                                    num1 += crazy;
                                    wdnmd++;
                                    j++;
                                }
                            }
                        }
                    }
                    if (k == 1) {
                        switch (str.charAt(m)) {
                            case ('+'):
                                result = num1 + num2;
                                break;
                            case ('-'):
                                result = num2 - num1;
                                break;
                            case ('*'):
                                result = num1 * num2;
                                break;
                            case ('/'):
                                result = num2 / num1;
                                break;
                            case ('%'):
                                result = num2 % num1;
                                break;
                            case ('='):
                                CharSequence chas1 = String.format("%.2f", result);
                                char st1, st2;
                                st1 = chas1.charAt(chas1.length() - 1);
                                st2 = chas1.charAt(chas1.length() - 2);
                                if ((st1 == '0') && (st2 == '0'))
                                    chas1 = chas1.subSequence(0, chas1.length() - 3);
                                tv1.setText(chas1);
                                break;
                            default:
                                String str1 = "error";
                                tv1.setText(str1);
                        }
                        m = j;
                    } else if (k > 1) {
                        switch (str.charAt(m)) {
                            case ('+'):
                                result += num1;
                                break;
                            case ('-'):
                                result -= num1;
                                break;
                            case ('*'):
                                result *= num1;
                                break;
                            case ('/'):
                                result /= num1;
                                break;
                            case ('%'):
                                result %= num1;
                                break;
                            case ('='):
                                CharSequence chas2 = String.format("%.2f", result);
                                char st1, st2;
                                st1 = chas2.charAt(chas2.length() - 1);
                                st2 = chas2.charAt(chas2.length() - 2);
                                if ((st1 == '0') && (st2 == '0'))
                                    chas2 = chas2.subSequence(0, chas2.length() - 3);
                                tv1.setText(chas2);
                                break;
                            default:
                                String str1 = "error";
                                tv1.setText(str1);
                        }
                        m = j;
                    } else
                        m = j;
                    num2 = num1;
                    i = j;
                    k++;
                    i++;
                }
            }
        });
    }
}