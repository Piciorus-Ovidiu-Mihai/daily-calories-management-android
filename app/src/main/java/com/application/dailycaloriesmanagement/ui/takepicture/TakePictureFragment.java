package com.application.dailycaloriesmanagement.ui.takepicture;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.application.dailycaloriesmanagement.R;

import java.io.File;

import static android.app.Activity.RESULT_OK;

public class TakePictureFragment extends Fragment {

    private TakePictureViewModel takePictureViewModel;
    Button take, show;
    ImageView photo;
    public File photosDirectory;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        takePictureViewModel =
                ViewModelProviders.of(this).get(TakePictureViewModel.class);
        View root = inflater.inflate(R.layout.fragment_takepicture, container, false);

        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        take = view.findViewById(R.id.takephoto);
        show = view.findViewById(R.id.photos);
        photo = view.findViewById(R.id.imageViewPhotos);
        photosDirectory = new File(Environment.getDataDirectory().toString(), "myphotos");
        photosDirectory.mkdirs();

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File tempPhoto = new File(photosDirectory, "temp.jpg");
                tempPhoto.renameTo(new File(photosDirectory, System.currentTimeMillis() + ".jpg"));

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                File tempPhoto = new File(photosDirectory, "temp.jpg");
                tempPhoto.renameTo(new File(photosDirectory, System.currentTimeMillis() + ".jpg"));
                try {
                    Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
                    photo.setImageBitmap(bitmap);
                } catch (Exception e) {
                    return;
                }
            } else {
                File tempPhoto = new File(photosDirectory, "temp.jpg");
                tempPhoto.delete();
            }
        }
    }
}