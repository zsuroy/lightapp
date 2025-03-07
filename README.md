# 🌐 LightApp - Android WebView Template 🚀

Welcome to the **LightApp** an Android WebView Template project! This template allows you to create 
an Android WebView application in just **minutes**. Whether you want to build a simple app for your 
website or kickstart your HTML5-based Android app, this template has got you covered.

Get started now and bring your web content to Android! 📱

---

## 🛠️ Getting Started

### 1. **Download or Clone the Repository** 📥

You can either download the project as a ZIP file or clone it using Git:

```bash
git clone https://github.com/zsuroy/lightapp.git
```

### 2. **Import into Android Studio** 🎯

Open **Android Studio** and import the project from the downloaded/cloned repository.

---

## 🚦 Using the Template

### 🌍 **Using a Remote Source (Website URL)**

If you want your app to display content from a **remote website**, follow these steps:

1. Open `MainActivity.java`.
2. Uncomment:
   ```java
   mWebView.loadUrl("https://example.com");
   ```
3. Replace `https://example.com` with your website's URL.

### 💻 **Using a Local Source (HTML5 Files)**

If you want to create a **local HTML5-based app**, follow these steps:

1. Open `MainActivity.java`.
2. Uncomment:
   ```java
   mWebView.loadUrl("file:///android_asset/index.html");
   ```
3. Place all your files (including `index.html`) in the `assets` directory.
 
4. Tips: For local HTML5 apps, place all your files (HTML, CSS, JS, etc.) in the `assets` directory.

---

## 📂 Project Structure

Here’s a quick overview of the project structure:

```
📁 app
   └── 📁 src
       └── 📁 main
           ├── 📁 java
           │   └── 📄 MainActivity.java
           ├── 📁 res
           │   └── 📁 layout
           │       └── 📄 activity_main.xml
           └── 📁 assets
               └── 📄 index.html (for local HTML5 apps)
```

---

## 🛠️ Key Features

- **Simple & Clean Code**: Easy to understand and customize.
- **Remote or Local Content**: Choose between loading a website or local HTML5 files.
- **Quick Setup**: Get your app running in minutes.

---


## 🙏 Credits

---

<details><summary>查看详情 (Click to show details)</summary><br>
<div align="center">
To tip online, scan the QR code below <br>
扫描对应二维码可打赏 <br><br>
I believe I could make it better with your support :) <br>
感谢每一份支持和鼓励 <br><br>

<a href="https://suroy.cn/usr/themes/Sunshine/images/donate/alipay.png"><img alt="Alipay sponsor" src="https://suroy.cn/usr/themes/Sunshine/images/donate/alipay.png" height="224"/></a>
<a href="https://suroy.cn/usr/themes/Sunshine/images/donate/wechat.png"><img alt="WeChat sponsor" src="https://suroy.cn/usr/themes/Sunshine/images/donate/wechat.png" height="224"/></a>
</div>
</details>
