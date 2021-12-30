// Generated by view binder compiler. Do not edit!
package com.mianasad.chatsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mianasad.chatsapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySetupProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button continueBtn;

  @NonNull
  public final CircleImageView imageView;

  @NonNull
  public final EditText nameBox;

  @NonNull
  public final TextView phoneLbl;

  @NonNull
  public final TextView textView4;

  private ActivitySetupProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button continueBtn, @NonNull CircleImageView imageView, @NonNull EditText nameBox,
      @NonNull TextView phoneLbl, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.continueBtn = continueBtn;
    this.imageView = imageView;
    this.nameBox = nameBox;
    this.phoneLbl = phoneLbl;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySetupProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySetupProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setup_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySetupProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueBtn;
      Button continueBtn = rootView.findViewById(id);
      if (continueBtn == null) {
        break missingId;
      }

      id = R.id.imageView;
      CircleImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.nameBox;
      EditText nameBox = rootView.findViewById(id);
      if (nameBox == null) {
        break missingId;
      }

      id = R.id.phoneLbl;
      TextView phoneLbl = rootView.findViewById(id);
      if (phoneLbl == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivitySetupProfileBinding((ConstraintLayout) rootView, continueBtn, imageView,
          nameBox, phoneLbl, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
