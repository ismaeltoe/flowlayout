# FlowLayout

Add views to a FlowLayout and each view is put to the right of the previous one and wraps to a new row when the current row is full.

<img alt="Demo" src="http://imgur.com/FwkPnpB.png" />

## Usage

```xml
<com.ismaeltoe.FlowLayout xmlns:f="http://schemas.android.com/apk/res-auto"
	android:id="@+id/flow_container"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    f:horizontalPadding="5dp"
    f:verticalPadding="5dp" />
	
	<!-- Add some views here or programmatically in Activity/Fragment -->

</com.ismaeltoe.FlowLayout>
```

## Sample

You can download the sample APK [here](https://drive.google.com/file/d/0B3jEzeKp9QMMQ2hLa1pscTdQMkk/view?usp=sharing).

<img alt="Demo" src="http://i.imgur.com/FA4CKY7.png" />

## Download

Add the following Gradle dependency:

```groovy
    compile 'com.github.ismaeltoe:flowlayout:1.0'
```

## Credits

[Android Custom Layout: FlowLayout](http://hzqtc.github.io/2013/12/android-custom-layout-flowlayout.html) article by [Johnny Huang](https://github.com/hzqtc).

## License

    Copyright 2015 Ismael Toé

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.