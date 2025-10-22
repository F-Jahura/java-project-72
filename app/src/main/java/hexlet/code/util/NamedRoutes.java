package hexlet.code.util;

@SuppressWarnings("java:S1118")
public final class NamedRoutes {
    private static final String URLS = "/urls/";

    private NamedRoutes() {
    }
    public static String rootPath() {
        return "/";
    }

    public static String urlsPath() {
        return "/urls";
    }

    public static String urlPath(Long id) {
        return urlPath(String.valueOf(id));
    }

    public static String urlPath(String id) {
        return URLS + id;
    }
}
