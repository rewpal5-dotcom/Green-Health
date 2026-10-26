# Green Health — Android APK

**पौधा पंडित (AI Plant Assistant)** web app ke liye native Android shell.

Site: https://6a63225cbe43e3de080235a1--paudhapandit.netlify.app/

**Direct APK download:** https://github.com/rewpal5-dotcom/Green-Health/releases/latest/download/app-debug.apk

## Kya hai isme

- **Progress bar** — page load hote waqt upar patli bar
- **Back button** — page history mein peeche jaata hai, app se bahar nahi nikalta
- **Offline screen** — internet na ho to "Internet nahi mila" aur Retry button
- **Zoom lock** — pinch zoom, double-tap zoom aur left-right panning band; page device width par fix
- **External links** — mailto, tel, WhatsApp, UPI ya doosri site ke link phone ke browser/app mein khulte hain
- **Downloads** — site se koi file download ho to Android DownloadManager se Downloads folder mein
- Cookies aur localStorage on — site ka data save rehta hai
- **Start.io ads** — neeche banner ad (App ID `209268815`), SDK 5.4.0
- Launcher par chhota naam: **GreenHealth** (pehle "Green Health" lamba dikh raha tha)

## Build

GitHub Actions se (`.github/workflows/build-apk.yml`). Har build release mein APK attach karti hai.

```bash
./gradlew assembleDebug
# app/build/outputs/apk/debug/app-debug.apk
```

## Note

- Debug-signed APK — direct install ke liye, Play Store ke liye release keystore chahiye.
- App site ko online load karta hai, isliye internet zaroori hai.
- Site ka URL `MainActivity.java` ke `START_URL` mein hai — badalna ho to wahi line badlein aur naya build chalayein.

## Tech

Java · minSdk 24 · targetSdk 35 · AGP 8.7.3 · Gradle 8.9

## License

MIT

## Ads (Start.io)

- App ID: `209268815`
- Banner: screen ke neeche, WebView ke thik niche
- `app-ads.txt` repo root mein hai — ad network verification ke liye
- Ads hataane ke liye `MainActivity.java` se `StartAppSDK.init(...)` aur `Banner` block hata dein, aur `app/build.gradle.kts` se dependency nikaal dein
