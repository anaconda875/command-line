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
java -cp out com.example.Main
```

## Video và danh sách phát
- [Cách compile và run Java project bằng command line](https://www.youtube.com/watch?v=vtliaLTh3NY)
- [Basic Java/Spring Boot](https://www.youtube.com/watch?v=vtliaLTh3NY&list=PLPmPxNDeXFx2REYgIyPFR5zdxy3oUqmZx)

## Liên hệ hỗ trợ và báo lỗi
- [SpringBoot Guru](https://www.facebook.com/profile.php?id=100093210926413)
- [Bao Ngo](https://www.facebook.com/baongosot)