package com.example.adminstration.homework;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewl_layout);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        String s = "<style>img{max-width:100%} </style> &nbsp;<b><span style=\"font-size:16.0pt;font-family:宋体;color:red;\">参观考察活动</span></b> \r\n<div align=\"center\">\r\n\t<table class=\"MsoNormalTable\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" width=\"551\" style=\"border-collapse:collapse;border:none;\">\r\n\t\t<tbody>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"551\" colspan=\"4\" style=\"border:solid windowtext 1.5pt;background:#CCCCFF;\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><span>5</span>月<span>27-28</span>日<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span><b><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></b><span style=\"color:#4D4D4D;\">（参加费用需另付）</span></span></span><b><span style=\"font-size:10.0pt;font-family:&quot;\"></span></b> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"74\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">日 期</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"60\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">时 间</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"306\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">地点及活动内容</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"111\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">住 宿</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"74\" rowspan=\"2\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><span>5</span>月<span>27</span>日</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"60\" valign=\"top\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">上午</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"306\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">前往苏州，参观苏州协鑫光伏科技有限公司</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"111\" rowspan=\"2\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">四星级酒店</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><span>(</span>苏州<span>)</span></span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"60\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">下午</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"306\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">参观苏州阿特斯阳光电力有限公司、协鑫能源中心</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"74\" rowspan=\"2\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><span>5</span>月<span>28</span>日</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"60\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">上午</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"306\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">参观上海艾力克新能源有限公司</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"111\" rowspan=\"2\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">结束</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><span>(16:00</span>左右<span>)</span></span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"60\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">下午</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"306\">\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<span style=\"font-size:small;\"><span style=\"font-family:Arial;\">参观上海晶澳太阳能科技有限公司</span></span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n\t\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</tbody>\r\n\t</table>\r\n</div>\r\n<p class=\"MsoNormal\" style=\"text-indent:50.0pt;\">\r\n\t<span style=\"font-size:10.0pt;font-family:宋体;\">考察须知：</span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n</p>\r\n<p class=\"MsoNormal\" style=\"margin-left:60.3pt;text-indent:-10.75pt;\">\r\n\t<!--[if !supportLists]--><span style=\"font-size:10.0pt;font-family:Symbol;\">·<span style=\"font-size:7pt;line-height:normal;font-family:'Times New Roman';\">&nbsp;&nbsp;&nbsp; </span></span><!--[endif]--><span style=\"font-size:10.0pt;font-family:宋体;\">所有考察人员请于</span><span style=\"font-size:10.0pt;font-family:&quot;\">5</span><span style=\"font-size:10.0pt;font-family:宋体;\">月</span><span style=\"font-size:10.0pt;font-family:&quot;\">27</span><span style=\"font-size:10.0pt;font-family:宋体;\">日</span><span style=\"font-size:10.0pt;font-family:&quot;\">07:50</span><span style=\"font-size:10.0pt;font-family:宋体;\">前往浦东新国际博览中心南广场门口（上海浦东新区龙阳路</span><span style=\"font-size:10.0pt;font-family:&quot;\">2345</span><span style=\"font-size:10.0pt;font-family:宋体;\">号，近芳甸路）集合，统一出发，过时不候；</span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n</p>\r\n<p class=\"MsoNormal\" style=\"margin-left:60.3pt;text-indent:-10.75pt;\">\r\n\t<!--[if !supportLists]--><span style=\"font-size:10.0pt;font-family:Symbol;\">·<span style=\"font-size:7pt;line-height:normal;font-family:'Times New Roman';\">&nbsp;&nbsp;&nbsp; </span></span><!--[endif]--><span style=\"font-size:10.0pt;font-family:&quot;\">5</span><span style=\"font-size:10.0pt;font-family:宋体;\">月</span><span style=\"font-size:10.0pt;font-family:&quot;\">28</span><span style=\"font-size:10.0pt;font-family:宋体;\">日早餐时间为</span><span style=\"font-size:10.0pt;font-family:&quot;\">8:00</span><span style=\"font-size:10.0pt;font-family:宋体;\">（</span><span style=\"font-size:10.0pt;font-family:&quot;\">7:30</span><span style=\"font-size:10.0pt;font-family:宋体;\">叫醒服务），所有人员请带行李、房间钥匙下楼用餐，</span><span style=\"font-size:10.0pt;font-family:&quot;\">8:30</span><span style=\"font-size:10.0pt;font-family:宋体;\">完成退房，</span><span style=\"font-size:10.0pt;font-family:&quot;\">8:40</span><span style=\"font-size:10.0pt;font-family:宋体;\">准时出发；</span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n</p>\r\n<p class=\"MsoNormal\" style=\"margin-left:60.3pt;text-indent:-10.75pt;\">\r\n\t<!--[if !supportLists]--><span style=\"font-size:10.0pt;font-family:Symbol;\">·<span style=\"font-size:7pt;line-height:normal;font-family:'Times New Roman';\">&nbsp;&nbsp;&nbsp; </span></span><!--[endif]--><span style=\"font-size:10.0pt;font-family:宋体;\">考察期间请服从工作人员的统一指挥，遵守作息时间，注意安全；</span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n</p>\r\n<p class=\"MsoNormal\" style=\"margin-left:60.3pt;text-indent:-10.75pt;\">\r\n\t<!--[if !supportLists]--><span style=\"font-size:10.0pt;font-family:Symbol;\">·<span style=\"font-size:7pt;line-height:normal;font-family:'Times New Roman';\">&nbsp;&nbsp;&nbsp; </span></span><!--[endif]--><span style=\"font-size:10.0pt;font-family:宋体;\">所有考察人员务必带上本人的有效身份证明；</span><span style=\"font-size:10.0pt;font-family:&quot;\"></span> \r\n</p>\r\n<div>\r\n\t<span style=\"font-size:10.0pt;font-family:宋体;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</span><span style=\"font-family:Symbol;font-size:13px;line-height:16px;\">·</span><span style=\"font-size:7pt;font-family:'Times New Roman';\">&nbsp;&nbsp;&nbsp;&nbsp;</span><span style=\"font-size:10.0pt;font-family:宋体;\">以上日程仅供参考，如有变动以最新通知为准。<br />\r\n<br />\r\n</span><strong><span style=\"color:#000000;\"><span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><span style=\"line-height:25.200000762939453px;\">关于参观考察活动的参加费用及报名事宜，请询问大会秘书处：</span></span></span></span></strong><span style=\"color:#000000;\"><span style=\"font-size:small;\"><span style=\"font-family:Arial;\"><br />\r\n<span style=\"line-height:25.200000762939453px;\">电话：+86-021-53893060</span><br />\r\n<span style=\"line-height:25.200000762939453px;\">邮箱：alywang@snec.org.cn</span></span></span></span><span style=\"font-size:10.0pt;font-family:宋体;\"><br />\r\n<br />\r\n<br />\r\n<br />\r\n</span> \r\n</div>";
        //加载html
        webView.loadDataWithBaseURL("about:blank",s,"text/html","utf-8",null );
    }

    //跳转至此活动方法
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, WebViewl.class);
        context.startActivity(intent);
    }
}