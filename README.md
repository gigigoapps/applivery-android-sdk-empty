# README
  For fix Google Play Store error with Applivery DownloadService,
 
>During review, we found that your app violates the Malicious Behavior policy. We don’t allow apps that allow users to download or install apps from unknown sources outside of Google Play.
You can read through the Malicious Behavior policy page for more details and examples of common violations.
For example, your app currently uses the Applivery SDK which contains a problematic code in the class "com.applivery.updates.DownloadService" ... 
 
You need to compile the aar library, copy it to your \ libs folder and add the dependencies for each configuration. It would be something like the following:
 ```gradle 
debugImplementation 'com.github.Applivery:applivery-android-sdk:v3.0.10'
productionImplementation fileTree(dir: 'libs', include: ['appliveryProxy.aar'])
releaseImplementation fileTree(dir: 'libs', include: ['appliveryProxy.aar'])
 ```
 
 
Beware of the typical line to add dependency of * .aar in the \libs folder
  Avoid the use of sentence:
   ```gradle
  implementation fileTree(dir: 'libs', include: ['*.aar'])
  ```
  and use the implementation only for each lib.aar that need for your build, for example:
```gradle
implementation fileTree(dir: 'libs', include: ['myLIbforallbuilds.aar'])
```
 