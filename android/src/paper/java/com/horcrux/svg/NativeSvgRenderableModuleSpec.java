/**
 * This code was generated by
 * [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * <p>Do not edit this file as changes may cause incorrect behavior and will be lost once the code
 * is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 * @nolint
 */
package com.horcrux.svg;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule
    implements ReactModuleWithSpec, TurboModule {
  public static final String NAME = "RNSVGRenderableModule";

  public NativeSvgRenderableModuleSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isPointInFill(@Nullable Double tag, @Nullable ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isPointInStroke(@Nullable Double tag, @Nullable ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getTotalLength(@Nullable Double tag);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getPointAtLength(@Nullable Double tag, @Nullable ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getBBox(@Nullable Double tag, @Nullable ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getCTM(@Nullable Double tag);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getScreenCTM(@Nullable Double tag);

  @ReactMethod
  @DoNotStrip
  public abstract void getRawResource(String name, Promise promise);
}
