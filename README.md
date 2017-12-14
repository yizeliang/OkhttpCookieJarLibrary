## OKhttp cookie持久化


## 申明

该库并是不本人写的,支持上传到仓库,作为依赖使用,看注释,本库可能为张弘洋所写

使用本库需要依赖

` compile 'com.squareup.okhttp3:okhttp:3.9.1' `

```java
  OkHttpClient.Builder builder = new OkHttpClient.Builder();
  builder.cookieJar(new CookieJarImpl(new PersistentCookieStore(MyApplication.getInstance())));
```


## 依赖

```gradle

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}



dependencies {
	        compile 'com.github.yizeliang:OkhttpCookieJarLibrary:1.0.0'
}

```