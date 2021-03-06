package cs4720.cs.virginia.edu.louslistrestapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by sherriff on 10/25/16.
 */

public class LousListAPIClient {
    public static final String BASE_URL = "http://stardock.cs.virginia.edu/louslist/Courses/view/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
