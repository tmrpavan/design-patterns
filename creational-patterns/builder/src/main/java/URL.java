import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class URL {
    //Required
    @Getter
    private String protocol;
    @Getter
    private String hostName;

    //Optional
    private String  port;
    private String pathParam;
    private String queryParam;

    public String getPort() {
        return port == null ? "" : port;
    }

    public String getPathParam() {
        return pathParam == null ? "" : pathParam;
    }

    public String getQueryParam() {
        return queryParam == null ? "" : queryParam;
    }

    public static URLBuilder builder(String protocol, String hostName){
        URLBuilder urlBuilder =  new URLBuilder();
        urlBuilder.protocol = protocol;
        urlBuilder.hostName = hostName;
        return urlBuilder;
    }

    public String getUrl(){
        return getProtocol()+getHostName()+getPort()+getPathParam()+getQueryParam();
    }

    public static class URLBuilder{
        private String protocol;
        private String hostName;
        private String port;
        private String pathParam;
        private String queryParam;

        public URLBuilder port(String port){
            this.port = port;
            return this;
        }

        public URLBuilder pathParam(String pathParam){
            this.pathParam = pathParam;
            return this;
        }

        public URLBuilder queryParam(String queryParam){
            this.queryParam = queryParam;
            return this;
        }

        public URL build(){
            return new URL(protocol, hostName, port, pathParam, queryParam);
        }
    }
}
