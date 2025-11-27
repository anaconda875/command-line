## Tài nguyên

| Bài giảng                                                                                                           | Branch                                                                        |
|---------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| [1. Cách compile và run Java project bằng command line (7p)](https://www.youtube.com/watch?v=vtliaLTh3NY)           | [main](https://github.com/anaconda875/command-line)                           |
| [2. Cách tích hợp thư viện vào Java project bằng command line (7p)](https://www.youtube.com/watch?v=UjJFCZpffZQ)    | [external-lib](https://github.com/anaconda875/command-line/tree/external-lib) |                                       |
| [3. Một số vấn đề thường gặp khi sử dụng thư viện ngoài bằng command line (hiện tại)](https://youtu.be/xL0x49R7Iok) | [conflict](https://github.com/anaconda875/command-line/tree/conflict)         |

- [Basic Java/Spring Boot](https://www.youtube.com/watch?v=vtliaLTh3NY&list=PLPmPxNDeXFx2REYgIyPFR5zdxy3oUqmZx)
- [Slides](./Basic%20Java.pptx)

## Nội dung

1. `javac`: Trình biên dịch Java, chuyển mã nguồn `.java` thành `bytecode` (chạy đa nền tảng).
2. `java`: Trình chạy Java, thực thi `bytecode` trên Java Virtual Machine (JVM).
3. `classpath`: Đường dẫn đến `bytecode` và các thư viện cần thiết để chạy chương trình.
4. Thư viện ngoài: Các gói jar chứa bytecode đã được biên dịch sẵn, giúp tái sử dụng mã nguồn và chức năng.

## Cách compile và run chương trình có gắn thư viện ngoài bằng command line (Windows)

1. Clone repository này về máy:
2. Mở terminal và điều hướng đến thư mục chứa mã nguồn

```powershell
cd command-line
```

3. Checkout branch `conflict`

```powershell
git checkout conflict
```

4. Compile mã nguồn thành bytecode bằng lệnh:

```powershell
# -cp out: Chỉ định classpath (nơi chứa thư viện)
javac -cp "lib\commons-lang3-3.18.0.jar" -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

5. Chạy chương trình bằng lệnh:

```powershell
# -cp "out;lib\*": Chỉ định classpath là thư mục out và lib
# nơi chứa bytecode đã compile và thư viện ngoài
# lỗi sẽ xuất hiện do có xung đột giữa các phiên bản thư viện
java -cp "out;lib\*" com.example.Main
```

## Liên hệ hỗ trợ và báo lỗi

- [SpringBoot Guru](https://www.facebook.com/profile.php?id=100093210926413)
- [Bao Ngo](https://www.facebook.com/baongosot)