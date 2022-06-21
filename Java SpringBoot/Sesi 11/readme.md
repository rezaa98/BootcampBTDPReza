Intinya instalaasi Database


validasi -> pengecekan data yang dimasukkan

use barang_ejaakkkk
db.createCollection("barang", {
	validator : {
		$jsonSchema : {
			bsonType : "object",
			required : ["namabarang", "hargabarang", "jenisbarang", "description"],
			properties : {
				namaBarang : {
					bsonType : "string",
					description : "Nama Barang harus berupa karakter dan tidak boleh kosong!"
				},
				hargaBarang : {
					bsonType : "number", 
					description : "Harga Barang harus berupa number dan tidak boleh kosong!"
				},
				jenisBarang : {
					bsonType : "objectId", 
					description : "Jenis Barang harus berupa objectID dan tidak boleh kosong!"
				},
				description : {
					bsonType : "array",
					description : "Deskripsi harus berupa karakter dan tidak boleh kosong!",
					items : {
						bsonType : "object",
						required : ["merk", "ukuran", "stok"],
						properties: {
							merk : { bsonType : "string", 
					   	         	   description : "Ukuran harus berupa karakter dan tidak boleh kosong!"
							}, 
							ukuran : { bsonType : "string",
					                       description : "Ukuran harus berupa karakter dan tidak boleh kosong!"
							},
				            	stok : { bsonType : "number", 
				                           description : "Stok harus berupa angka dan tidak boleh kosong!"
				            	}
						}
			            }
	                   }
			}
		}
	}
})
