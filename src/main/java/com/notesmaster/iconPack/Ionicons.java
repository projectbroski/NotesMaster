package com.notesmaster;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ionicons {
    private static Font ioniconsFont;

    static {
        try {
            ioniconsFont = Font.createFont(Font.TRUETYPE_FONT, new File("/home/user/Documents/java/desktop/notesmaster/src/main/resources/icons/ionicons.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Font getFont(float size) {
        return ioniconsFont.deriveFont(size);
    }


    public static String getIcon(String iconName) {
        switch (iconName.toLowerCase()) {
            case "heart":
                return "&#xf112;";
            case "home":
                return "\uf104";
            case "star":
                return "\uf26c";
            case "person":
                return "\uf128";
            case "settings":
                return "\uf013";
            case "search":
                return "\uf002";
            case "add":
                return "\uf042";
            case "checkmark":
                return "\uf00c";
            case "close":
                return "\uf00d";
            case "trash":
                return "\uf1f8";
            case "share":
                return "\uf064";
            case "menu":
                return "\uf394";
            case "play":
                return "\uf04b";
            case "pause":
                return "\uf04c";
            case "camera":
                return "\uf030";
            case "mic":
                return "\uf130";
            case "lock":
                return "\uf023";
            case "unlock":
                return "\uf09c";
            case "check":
                return "\uf00c";
            case "arrow-up":
                return "\uf062";
            case "arrow-down":
                return "\uf063";
            case "arrow-left":
                return "\uf060";
            case "arrow-right":
                return "\uf061";
            case "wifi":
                return "\uf1eb";
            case "bluetooth":
                return "\uf294";
            case "battery":
                return "\uf240";
            case "cloud":
                return "\uf0c2";
            case "earth":
                return "\uf57c";
            case "cloud-upload":
                return "\uf0ee";
            case "cloud-download":
                return "\uf0ed";
            case "phone":
                return "\uf095";
            case "tablet":
                return "\uf10a";
            case "laptop":
                return "\uf109";
            case "camera-outline":
                return "\uf5b4";
            case "person-add":
                return "\uf181";
            case "key":
                return "\uf084";
            case "flame":
                return "\uf1a5";
            case "star-outline":
                return "\uf18e";
            case "wifi-outline":
                return "\uf1eb";
            case "heart-outline":
                return "\uf2b9";
            case "list":
                return "\uf03a";
            case "document":
                return "\uf0f6";
            case "checkmark-circle":
                return "\uf058";
            case "alert":
                return "\uf05a";
            case "pin":
                return "\uf231";
            case "map":
                return "\uf279";
            case "compass":
                return "\uf14e";
            case "thumbs-up":
                return "\uf164";
            case "thumbs-down":
                return "\uf165";
            case "share-alt":
                return "\uf1e0";
            case "chatbox":
                return "\uf12e";
            case "chatbox-working":
                return "\uf12f";
            case "email":
                return "\uf0e0";
            case "home-outline":
                return "\uf4c4";
            case "settings-outline":
                return "\uf2f9";
            case "refresh":
                return "\uf021";
            case "infinite":
                return "\uf29c";
            case "refresh-circle":
                return "\uf328";
            case "reorder":
                return "\uf2c9";
            case "list-box":
                return "\uf0ca";
            case "navigate":
                return "\uf3f0";
            case "help":
                return "\uf05b";
            case "download":
                return "\uf019";
            case "share-social":
                return "\uf3c5";
            case "star-half":
                return "\uf5c0";
            case "bug":
                return "\uf188";
            case "trash-outline":
                return "\uf1f8";
            case "pin-outline":
                return "\uf231";
            case "search-outline":
                return "\uf1e5";
            case "paper-plane":
                return "\uf1d8";
            case "people":
                return "\uf2c3";
            case "play-circle":
                return "\uf28b";
            case "pause-circle":
                return "\uf290";
            case "stop-circle":
                return "\uf292";
            case "time":
                return "\uf179";
            case "alarm":
                return "\uf34e";
            case "flag":
                return "\uf024";
            case "flask":
                return "\uf25c";
            case "hammer":
                return "\uf10d";
            case "shield":
                return "\uf132";
            case "card":
                return "\uf1b3";
            case "desktop":
                return "\uf108";
            case "cloud-circle":
                return "\uf0e6";
            case "star-sharp":
                return "\uf517";
            default:
                return "";
           }
        }
}