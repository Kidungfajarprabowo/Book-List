package com.example.kfajarbowo.daftarbuku.network;

import com.example.kfajarbowo.daftarbuku.model.BukuResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BukuService {
    @GET("buku/search/{pengarang}")
    Call<BukuResult> getBuku(@Path("pengarang") String pengarang);
}
