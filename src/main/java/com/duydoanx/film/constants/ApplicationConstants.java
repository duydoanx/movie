package com.duydoanx.film.constants;

public class ApplicationConstants {
    public static final String VIDEO = "/home/duydoan/Videos";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String VIDEO_CONTENT = "video/";
    public static final String CONTENT_RANGE = "Content-Range";
    public static final String ACCEPT_RANGES = "Accept-Ranges";
    public static final String BYTES = "bytes";
    public static final int BYTE_RANGE = 1024;

    public static enum VIDEO_TYPE{
        MP4("mp4");

        private String value;

        VIDEO_TYPE(String value) {
            this.value = value;
        }
    }

    private ApplicationConstants() {
    }
}
