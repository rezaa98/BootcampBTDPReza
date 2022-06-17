<h1>Tutorial Langkah - Langkah Menggunakan GIT</h1>

<h3>
1. Config awal </h3>
<p>
git config --global user.name "Nama"
git config --global user.email "email"
git config --global credential.username "username"</p>

<h3>
2. Pindah Branch / Cabang </h3>
<p>git checkout -b main
git checkout -b master </p>

<h3>
3. cara menggunakan git</h3>

<p>
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
</p>