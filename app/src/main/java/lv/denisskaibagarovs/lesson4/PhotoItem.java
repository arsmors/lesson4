package lv.denisskaibagarovs.lesson4;

import java.util.Map;

public class PhotoItem {
    Map<String, String> urls;
    User user;

    public String getImgUrl() {
        return this.urls.get("regular");
    }

    // TODO Write a function to get authorName from User

    public class User {
        Map<String, String> user;
        String name;

        public String getAuthorName() {
            return this.user.get("user");
        }

    }
}
