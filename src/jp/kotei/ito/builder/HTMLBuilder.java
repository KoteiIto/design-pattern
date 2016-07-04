package jp.kotei.ito.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class HTMLBuilder implements Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.printf("<html><head><title>%s</title></head><body>\n", title);
        writer.printf("<title>%s</title>\n", title);
    }

    @Override
    public void makeString(String str) {
        writer.printf("<p>%s</p>\n", str);
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.printf("<li>%s</li>\n", item);
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body><html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
