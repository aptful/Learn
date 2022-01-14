// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Signup1Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView IDText;

  @NonNull
  public final TextView IDcomentText;

  @NonNull
  public final TextView attentionSinupText;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final TextView birthText;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final EditText dayEdit;

  @NonNull
  public final TextView dayText;

  @NonNull
  public final TextView id;

  @NonNull
  public final EditText monthEdit;

  @NonNull
  public final TextView monthText;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final EditText passwordEdit;

  @NonNull
  public final TextView passwordText;

  @NonNull
  public final TextView seirekiText;

  @NonNull
  public final TextView sigupOneLabel;

  @NonNull
  public final EditText yearEdit;

  @NonNull
  public final TextView yearText;

  private Signup1Binding(@NonNull LinearLayout rootView, @NonNull TextView IDText,
      @NonNull TextView IDcomentText, @NonNull TextView attentionSinupText,
      @NonNull ImageView backButton, @NonNull TextView birthText, @NonNull Button cancelButton,
      @NonNull EditText dayEdit, @NonNull TextView dayText, @NonNull TextView id,
      @NonNull EditText monthEdit, @NonNull TextView monthText, @NonNull Button nextButton,
      @NonNull EditText passwordEdit, @NonNull TextView passwordText, @NonNull TextView seirekiText,
      @NonNull TextView sigupOneLabel, @NonNull EditText yearEdit, @NonNull TextView yearText) {
    this.rootView = rootView;
    this.IDText = IDText;
    this.IDcomentText = IDcomentText;
    this.attentionSinupText = attentionSinupText;
    this.backButton = backButton;
    this.birthText = birthText;
    this.cancelButton = cancelButton;
    this.dayEdit = dayEdit;
    this.dayText = dayText;
    this.id = id;
    this.monthEdit = monthEdit;
    this.monthText = monthText;
    this.nextButton = nextButton;
    this.passwordEdit = passwordEdit;
    this.passwordText = passwordText;
    this.seirekiText = seirekiText;
    this.sigupOneLabel = sigupOneLabel;
    this.yearEdit = yearEdit;
    this.yearText = yearText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Signup1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Signup1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.signup1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Signup1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.IDText;
      TextView IDText = ViewBindings.findChildViewById(rootView, id);
      if (IDText == null) {
        break missingId;
      }

      id = R.id.IDcomentText;
      TextView IDcomentText = ViewBindings.findChildViewById(rootView, id);
      if (IDcomentText == null) {
        break missingId;
      }

      id = R.id.attention_sinupText;
      TextView attentionSinupText = ViewBindings.findChildViewById(rootView, id);
      if (attentionSinupText == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.birthText;
      TextView birthText = ViewBindings.findChildViewById(rootView, id);
      if (birthText == null) {
        break missingId;
      }

      id = R.id.cancelButton;
      Button cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.dayEdit;
      EditText dayEdit = ViewBindings.findChildViewById(rootView, id);
      if (dayEdit == null) {
        break missingId;
      }

      id = R.id.dayText;
      TextView dayText = ViewBindings.findChildViewById(rootView, id);
      if (dayText == null) {
        break missingId;
      }

      id = R.id.id;
      TextView id_ = ViewBindings.findChildViewById(rootView, id);
      if (id_ == null) {
        break missingId;
      }

      id = R.id.monthEdit;
      EditText monthEdit = ViewBindings.findChildViewById(rootView, id);
      if (monthEdit == null) {
        break missingId;
      }

      id = R.id.monthText;
      TextView monthText = ViewBindings.findChildViewById(rootView, id);
      if (monthText == null) {
        break missingId;
      }

      id = R.id.nextButton;
      Button nextButton = ViewBindings.findChildViewById(rootView, id);
      if (nextButton == null) {
        break missingId;
      }

      id = R.id.passwordEdit;
      EditText passwordEdit = ViewBindings.findChildViewById(rootView, id);
      if (passwordEdit == null) {
        break missingId;
      }

      id = R.id.passwordText;
      TextView passwordText = ViewBindings.findChildViewById(rootView, id);
      if (passwordText == null) {
        break missingId;
      }

      id = R.id.seirekiText;
      TextView seirekiText = ViewBindings.findChildViewById(rootView, id);
      if (seirekiText == null) {
        break missingId;
      }

      id = R.id.sigupOneLabel;
      TextView sigupOneLabel = ViewBindings.findChildViewById(rootView, id);
      if (sigupOneLabel == null) {
        break missingId;
      }

      id = R.id.yearEdit;
      EditText yearEdit = ViewBindings.findChildViewById(rootView, id);
      if (yearEdit == null) {
        break missingId;
      }

      id = R.id.yearText;
      TextView yearText = ViewBindings.findChildViewById(rootView, id);
      if (yearText == null) {
        break missingId;
      }

      return new Signup1Binding((LinearLayout) rootView, IDText, IDcomentText, attentionSinupText,
          backButton, birthText, cancelButton, dayEdit, dayText, id_, monthEdit, monthText,
          nextButton, passwordEdit, passwordText, seirekiText, sigupOneLabel, yearEdit, yearText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
