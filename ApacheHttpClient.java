/*
 * Hogon created 2016/5/3
 * need to include Apache http client libraries ond Appche common IO libraries into the external lib
 * 
 * */

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHttpClient {
	public static void main(String args[]) throws IOException {
		DefaultHttpClient client = new DefaultHttpClient();
	    HttpGet request = new HttpGet("http://10.244.0.6:8080");
	    request.setHeader("User-Agent","curl/7.16.3 (i686-pc-cygwin) libcurl/7.16.3 OpenSSL/0.9.8h zlib/1.2.3 libssh2/0.15-CVS");
	    HttpResponse response = client.execute(request);

	    // Get the response
	    String addr = IOUtils.toString(new InputStreamReader(response.getEntity().getContent()));
	    System.out.println(addr);

    }


}
