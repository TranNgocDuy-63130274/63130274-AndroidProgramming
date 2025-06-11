package vn.ntu.thicuoiki_nhom;

import java.util.ArrayList;
import java.util.List;
public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create
        final QuestionsList question1 = new QuestionsList("Kích thước của biến int trong Java là bao nhiêu?", "16bit", "8bit", "32bit", "64bit", "32bit","");
        final QuestionsList question2 = new QuestionsList("Từ khóa nào sau đây là từ khóa dự trữ trong Java?", "method", "native", "include", "define", "native", "");
        final QuestionsList question3 = new QuestionsList("Kiểu dữ liệu nào dùng để lưu giá trị đúng/sai trong Java?", "int", "char", "boolean", "String", "boolean", "");
        final QuestionsList question4 = new QuestionsList("Phương thức main trong Java có chữ ký nào sau đây là đúng?", "void main()", "public static void main(String[] args)", "static public void main()", "public void static main(String[] args)", "public void static main(String[] args)", "");
        final QuestionsList question5 = new QuestionsList("Lớp trong Java được khai báo bằng từ khóa nào?", "object", "class", "define", "structure", "class", "");
        final QuestionsList question6 = new QuestionsList("Trong Java, final dùng để làm gì?", "Định nghĩa lớp cha", "Tạo lớp mới", "Ngăn không cho thay đổi giá trị", "Thực hiện ép kiểu", "Ngăn không cho thay đổi giá trị", "");

        // Thêm vào danh sách
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(
                "HTML là viết tắt của cụm từ nào?",
                "HyperText Markup Language",
                "HighText Machine Language",
                "HyperTabular Markup Language",
                "None of the above",
                "HyperText Markup Language",
                ""
        );

        final QuestionsList question2 = new QuestionsList(
                "Thẻ nào dùng để tạo tiêu đề lớn trong HTML?",
                "<h1>",
                "<head>",
                "<title>",
                "<header>",
                "<h1>",
                ""
        );

        final QuestionsList question3 = new QuestionsList(
                "Thuộc tính nào dùng để chèn liên kết trong HTML?",
                "link",
                "href",
                "src",
                "ref",
                "href",
                ""
        );

        final QuestionsList question4 = new QuestionsList(
                "Thẻ nào dùng để chèn hình ảnh trong HTML?",
                "<img>",
                "<image>",
                "<pic>",
                "<src>",
                "<img>",
                ""
        );

        final QuestionsList question5 = new QuestionsList(
                "HTML không phải là:",
                "Ngôn ngữ lập trình",
                "Ngôn ngữ đánh dấu",
                "Hệ thống cấu trúc web",
                "Hỗ trợ trình duyệt",
                "Ngôn ngữ lập trình",
                ""
        );

        final QuestionsList question6 = new QuestionsList("Thẻ nào dùng để tạo danh sách có thứ tự (số)?", "<ul>", "<ol>", "<li>", "<dl>", "<ol>", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> cQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(
                "Ngôn ngữ C được phát triển bởi ai?",
                "Bjarne Stroustrup",
                "James Gosling",
                "Dennis Ritchie",
                "Guido van Rossum",
                "Dennis Ritchie",
                ""
        );

        final QuestionsList question2 = new QuestionsList(
                "Câu lệnh nào dùng để in dữ liệu ra màn hình trong C?",
                "echo",
                "cout",
                "print()",
                "printf()",
                "printf()",
                ""
        );

        final QuestionsList question3 = new QuestionsList(
                "Hàm chính trong chương trình C là gì?",
                "start()",
                "init()",
                "main()",
                "execute()",
                "main()",
                ""
        );

        final QuestionsList question4 = new QuestionsList(
                "Tệp tiêu đề nào chứa khai báo hàm printf()?",
                "conio.h",
                "math.h",
                "stdio.h",
                "stdlib.h",
                "stdio.h",
                ""
        );

        final QuestionsList question5 = new QuestionsList(
                "Từ khóa nào dùng để định nghĩa hằng số trong C?",
                "let",
                "const",
                "final",
                "define",
                "define",
                ""
        );

        final QuestionsList question6 = new QuestionsList(
                "Toán tử dùng để gán giá trị trong C là gì?",
                "==",
                "=",
                ":=",
                "=>",
                "=",
                ""
        );

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(
                "Ai là người phát triển ngôn ngữ Python?",
                "James Gosling",
                "Guido van Rossum",
                "Bjarne Stroustrup",
                "Dennis Ritchie",
                "Guido van Rossum",
                ""
        );

        final QuestionsList question2 = new QuestionsList(
                "Python là ngôn ngữ loại nào?",
                "Biên dịch",
                "Đa hình",
                "Thông dịch",
                "Đa chiều",
                "Thông dịch",
                ""
        );

        final QuestionsList question3 = new QuestionsList(
                "Câu lệnh để in ra màn hình trong Python là gì?",
                "printf()",
                "cout",
                "echo",
                "print()",
                "print()",
                ""
        );

        final QuestionsList question4 = new QuestionsList(
                "Kết quả của biểu thức 2 ** 3 trong Python là gì?",
                "6",
                "8",
                "9",
                "5",
                "8",
                ""
        );

        final QuestionsList question5 = new QuestionsList(
                "Danh sách (list) trong Python được khai báo bằng ký hiệu nào?",
                "{}",
                "()",
                "[]",
                "<>",
                "[]",
                ""
        );

        final QuestionsList question6 = new QuestionsList(
                "Từ khóa nào dùng để định nghĩa hàm trong Python?",
                "function",
                "define",
                "def",
                "func",
                "def",
                ""
        );

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Java":
                return javaQuestions();

            case "HTML":
                return htmlQuestions();

            case "C":
                return cQuestions();

            case "Python":
                return pythonQuestions();

            default:
                return new ArrayList<>(); // Trả về danh sách rỗng nếu chủ đề không khớp
        }
    }


}
