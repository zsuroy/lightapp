package cn.suroy.lightapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;

public class DrawerManager {

    private final Activity mActivity;
    private final DrawerLayout mDrawerLayout;
    private final ListView mDrawerList;

    public DrawerManager(Activity activity, DrawerLayout drawerLayout, ListView drawerList) {
        this.mActivity = activity;
        this.mDrawerLayout = drawerLayout;
        this.mDrawerList = drawerList;
        String[] mMenuTitles = activity.getResources().getStringArray(R.array.menu_titles);

        // 设置适配器
        mDrawerList.setAdapter(new ArrayAdapter<>(activity, R.layout.drawer_list_item, mMenuTitles));
        mDrawerList.setOnItemClickListener((parent, view, position, id) -> {
            // 处理菜单项点击事件
            selectItem(position);
        });
    }

    private void selectItem(int position) {
        // 根据position加载不同的内容
        switch (position) {
            case 0:
                // 加载首页内容
                ((MainActivity) mActivity).getWebView().loadUrl("https://suroy.cn");
                break;
            case 1:
                Toast.makeText(mActivity, "building...", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                new AlertDialog.Builder(mActivity)
                        .setTitle("关于")
                        .setMessage("LightApp - a quick app shell.\r\n\r\n" +
                                "Author: Suroy | https://suroy.cn \r\n" +
                                "Wechat ID: suroys")
                        .setPositiveButton("OK", (dialog, which) -> {})
                        .setNegativeButton("Support", (dialog, which) -> {
                            try {
                                String qqUrl = "mqqapi://card/show_pslcard?src_type=internal&version=1&uin=955978561&card_type=group&source=qrcode";
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(qqUrl));
                                mActivity.startActivity(intent);
                            } catch (Exception e) {
                                Toast.makeText(mActivity, "未安装QQ或QQ版本过低", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .show();
                break;
            case 3:
                // 使用系统浏览器打开网页
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://suroy.cn"));
                mActivity.startActivity(browserIntent);
                break;
            case 4:
                // 退出应用
                mActivity.finish();
                break;
        }

        // 关闭侧边菜单栏
        mDrawerLayout.closeDrawer(mDrawerList);
    }
}