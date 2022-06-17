Tutorial Langkah - Langkah Menggunakan GIT

1.
git config --global user.name "Nama"
git config --global user.email "email"
git config --global credential.username "username"

2. //pindah branch
git checkout -b main
git checkout -b master

3. cara menggunakan git
---
git init
git remote add origin url
git add README.md
git commit -m "first commit"
git checkout -b main
git pull origin branchname --allow-unrelated-histories
git push -u origin main

pull git pertama kali jika sudah remote
---
git pull origin branchname --allow-unrelated-histories