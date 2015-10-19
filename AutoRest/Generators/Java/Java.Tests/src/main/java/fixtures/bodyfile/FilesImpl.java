/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import java.io.InputStream;
import fixtures.bodyfile.models.Error;

public class FilesImpl implements Files {
    private FilesService service;
    AutoRestSwaggerBATFileService client;

    public FilesImpl(Retrofit retrofit, AutoRestSwaggerBATFileService client) {
        this.service = retrofit.create(FilesService.class);
        this.client = client;
    }

    /**
     * Get file
     *
     * @return the InputStream object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public InputStream getFile() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getFile();
            ServiceResponse<InputStream> response = getFileDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get file
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        Call<ResponseBody> call = service.getFile();
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getFileDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<InputStream> getFileDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<InputStream>()
                .register(200, new TypeToken<InputStream>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get empty file
     *
     * @return the InputStream object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public InputStream getEmptyFile() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getEmptyFile();
            ServiceResponse<InputStream> response = getEmptyFileDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get empty file
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getEmptyFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        Call<ResponseBody> call = service.getEmptyFile();
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getEmptyFileDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<InputStream> getEmptyFileDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<InputStream>()
                .register(200, new TypeToken<InputStream>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
