// Generated by view binder compiler. Do not edit!
package com.doni.flowerimageprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.doni.flowerimageprediction.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView dateTextView;

  @NonNull
  public final ScrollView main;

  @NonNull
  public final ImageView resultImage;

  @NonNull
  public final TextView resultText;

  @NonNull
  public final Button saveButton;

  private ActivityResultBinding(@NonNull ScrollView rootView, @NonNull TextView dateTextView,
      @NonNull ScrollView main, @NonNull ImageView resultImage, @NonNull TextView resultText,
      @NonNull Button saveButton) {
    this.rootView = rootView;
    this.dateTextView = dateTextView;
    this.main = main;
    this.resultImage = resultImage;
    this.resultText = resultText;
    this.saveButton = saveButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateTextView;
      TextView dateTextView = ViewBindings.findChildViewById(rootView, id);
      if (dateTextView == null) {
        break missingId;
      }

      ScrollView main = (ScrollView) rootView;

      id = R.id.result_image;
      ImageView resultImage = ViewBindings.findChildViewById(rootView, id);
      if (resultImage == null) {
        break missingId;
      }

      id = R.id.result_text;
      TextView resultText = ViewBindings.findChildViewById(rootView, id);
      if (resultText == null) {
        break missingId;
      }

      id = R.id.saveButton;
      Button saveButton = ViewBindings.findChildViewById(rootView, id);
      if (saveButton == null) {
        break missingId;
      }

      return new ActivityResultBinding((ScrollView) rootView, dateTextView, main, resultImage,
          resultText, saveButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
