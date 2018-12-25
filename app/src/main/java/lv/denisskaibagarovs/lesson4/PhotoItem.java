package lv.denisskaibagarovs.lesson4;

import android.location.Location;
import android.util.EventLogTags;

import java.util.Map;

//public class PhotoItem {
//    Map<String, String> urls;
//    User user;
//
//    public String getImgUrl() {
//        return this.urls.get("regular");
//    }
//
//    public String getAuthorName() {
//        return user.getAuthorName();
//    }
//
//    // TODO Write a function to get authorName from User
//
//    public class User {
//        Map<String, String> user;
//        String name;
//
//        public String getAuthorName() {
//            return this.user.get("user");
//        }
//
//    }
//}

public class PhotoItem {
    Images urls;
    User user;


    public String getImgUrl() {
        return this.urls.regular;
    }

    public String getAuthorName() {
        return this.user.name;
    }

    public String getUserLocation() {
        return this.user.location;
    }


    public class User {
        String name;
        String location;
    }

    public class Images {
        String regular;
    }

}
