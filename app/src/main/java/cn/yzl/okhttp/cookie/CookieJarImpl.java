package cn.yzl.okhttp.cookie;


import java.util.List;

import cn.yzl.okhttp.cookie.store.CookieStore;
import cn.yzl.okhttp.cookie.store.HasCookieStore;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * Created by zhy on 16/3/10.
 */
public class CookieJarImpl implements CookieJar, HasCookieStore {
    private CookieStore cookieStore;

    public CookieJarImpl(CookieStore cookieStore) {
        if (cookieStore == null)
            throw new IllegalArgumentException(String.format("cookieStore can not be null."));
        this.cookieStore = cookieStore;
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
            cookieStore.add(url, cookies);
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
            return cookieStore.get(url);
    }

    @Override
    public CookieStore getCookieStore() {
        return cookieStore;
    }
}
