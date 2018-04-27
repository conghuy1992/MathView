package com.conghuy.examplejava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        MathView mathView=new MathView(this,null);
//        mathView.config(
//                "MathJax.Hub.Config({\n"+
//                        "  CommonHTML: { linebreaks: { automatic: true } },\n"+
//                        "  \"HTML-CSS\": { linebreaks: { automatic: true } },\n"+
//                        "         SVG: { linebreaks: { automatic: true } }\n"+
//                        "});");

        MyMathView formula_two = (MyMathView) findViewById(R.id.formula_two);


        formula_two.setText(txt);

//        TextView tv=null;
//        tv.setText(Html.fromHtml(txt));
    }

    String msg = "When $a \\ne 0$, there are two solutions to \\(ax^2 + bx + c = 0\\) and they are\n" +
            "$$x = {-b \\pm \\sqrt{b^2-4ac} \\over 2a}.$$";
    String tex = "This come from string. You can insert inline formula:" +
            " \\(ax^2 + bx + c = 0\\) " +
            "or displayed formula: $$\\sum_{i=0}^n i^2 = \\frac{(n^2+n)(2n+1)}{6}$$";

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    String txt = "<math style=\"font-family:'Times New Roman'\" xmlns=\"http://www.w3.org/1998/Math/MathML\"><mstyle mathsize=\"14px\"><mn>1</mn><mo>.</mo><mo>&#xA0;</mo><mi>&#x110;&#x1ECB;nh</mi><mo>&#xA0;</mo><mi>ngh&#x129;a</mi><mspace linebreak=\"newline\"/><mi>Cho</mi><mo>&#xA0;</mo><mi>h&#xE0;m</mi><mo>&#xA0;</mo><mi>s&#x1ED1;</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">y</mi><mo>=</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mi>x&#xE1;c</mi><mo>&#xA0;</mo><mi>&#x111;&#x1ECB;nh</mi><mo>&#xA0;</mo><mi>tr&#xEA;n</mi><mo>&#xA0;</mo><mi>t&#x1EAD;p</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">D</mi><mspace linebreak=\"newline\"/><mo>.</mo><mo>&#xA0;</mo><mi mathvariant=\"normal\">M</mi><mo>&#xA0;</mo><mi>&#x111;&#x1B0;&#x1EE3;c</mi><mo>&#xA0;</mo><mi>g&#x1ECD;i</mi><mo>&#xA0;</mo><mi>l&#xE0;</mi><mo>&#xA0;</mo><mi>GTLN</mi><mo>&#xA0;</mo><mi>c&#x1EE7;a</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mi>tr&#xEA;n</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">D</mi><mo>&#xA0;</mo><mi>n&#x1EBF;u</mi><mo>:</mo><mo>&#xA0;</mo><mfenced open=\"{\" close=\"\"><mtable columnalign=\"left\"><mtr><mtd><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mo>&#x2264;</mo><mi mathvariant=\"normal\">M</mi></mtd></mtr><mtr><mtd><mo>&#x2203;</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>,</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>)</mo><mo>&#xA0;</mo><mo>=</mo><mo>&#xA0;</mo><mi mathvariant=\"normal\">M</mi></mtd></mtr></mtable></mfenced><mspace linebreak=\"newline\"/><mo>.</mo><mo>&#xA0;</mo><mi mathvariant=\"normal\">m</mi><mo>&#xA0;</mo><mi>&#x111;&#x1B0;&#x1EE3;c</mi><mo>&#xA0;</mo><mi>g&#x1ECD;i</mi><mo>&#xA0;</mo><mi>l&#xE0;</mi><mo>&#xA0;</mo><mi>GTNN</mi><mo>&#xA0;</mo><mi>c&#x1EE7;a</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mi>tr&#xEA;n</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">D</mi><mo>&#xA0;</mo><mi>n&#x1EBF;u</mi><mo>:</mo><mo>&#xA0;</mo><mfenced open=\"{\" close=\"\"><mtable columnalign=\"left\"><mtr><mtd><mi mathvariant=\"normal\">m</mi><mo>&#x2264;</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>,</mo><mo>&#x2200;</mo><mi mathvariant=\"normal\">x</mi><mo>&#x2208;</mo><mi mathvariant=\"normal\">D</mi></mtd></mtr><mtr><mtd><mo>&#x2200;</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>&#x2208;</mo><mi mathvariant=\"normal\">D</mi><mo>,</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>)</mo><mo>=</mo><mi mathvariant=\"normal\">m</mi></mtd></mtr></mtable></mfenced></mstyle></math>";
}
