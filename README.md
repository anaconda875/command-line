## Tài nguyên
| Bài giảng                                                                                                                          | Branch                                                                        |
|------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| [1. Cách compile và run Java project bằng command line (hiện tại)](https://www.youtube.com/watch?v=vtliaLTh3NY)                    | [main](https://github.com/anaconda875/command-line)                           |
| [2. Cách tích hợp thư viện vào Java project bằng command line (7p)](https://github.com/anaconda875/command-line/tree/external-lib) | [external-lib](https://github.com/anaconda875/command-line/tree/external-lib) |                                       |

- [Basic Java/Spring Boot](https://www.youtube.com/watch?v=vtliaLTh3NY&list=PLPmPxNDeXFx2REYgIyPFR5zdxy3oUqmZx)
- [Slides](./Basic%20Java.pptx)

## Nội dung
1. `javac`: Trình biên dịch Java, chuyển mã nguồn `.java` thành `bytecode` (chạy đa nền tảng).
2. `java`: Trình chạy Java, thực thi `bytecode` trên Java Virtual Machine (JVM).
3. `classpath`: Đường dẫn đến `bytecode` và các thư viện cần thiết để chạy chương trình.

## Cách compile và run chương trình bằng command line (Windows)

1. Clone repository này về máy
2. Mở terminal và điều hướng đến thư mục chứa mã nguồn
```powershell
cd command-line
```
3. Compile mã nguồn thành bytecode bằng lệnh:
```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```
4. Chạy chương trình bằng lệnh:
```powershell
# -cp out: Chỉ định classpath là thư mục out, nơi chứa bytecode đã biên dịch 
java -cp out com.example.Main
```

## Liên hệ hỗ trợ và báo lỗi
- [SpringBoot Guru](https://www.facebook.com/profile.php?id=100093210926413)
- [Bao Ngo](https://www.facebook.com/baongosot)