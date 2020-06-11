package com.applivery.applvsdklib;

import android.app.Application;
import java.util.Collection;

public class Applivery {

  public static void init(@NonNull Application app, @NonNull String appToken, boolean isStoreRelease) {

  }

  public static void setCheckForUpdatesBackground(Boolean checkForUpdatesBackground) {

  }

  public static Boolean getCheckForUpdatesBackground() {
    return false;
}

  public static void checkForUpdates() {

  }

  public static void enableShakeFeedback() {

  }

  public static void disableShakeFeedback() {

  }

  public static void enableScreenshotFeedback() {

  }

  public static void disableScreenshotFeedback() {

  }

  public static void bindUser(@NonNull String email, @Nullable String firstName, @Nullable String lastName, @Nullable
      Collection<String> tags) {

  }

  public static void bindUser(@NonNull String email, @Nullable String firstName, @Nullable String lastName, @Nullable Collection<String> tags, @Nullable BindUserCallback callback) {

  }

  public static void unbindUser() {

  }
}
