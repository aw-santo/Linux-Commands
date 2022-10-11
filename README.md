***put command and its short description exact like given below, after ```Linux-Commands```***  

\- command name  
command description


\- next command  
command description  
  
  
# Linux-Commands
***\<start writing below />***

> Copy a File from one User to another using terminal, Here we are copying file Input.txt present in Downloads of user 'Amaan' to user Downloads directory of user 'Amaan2'
```sudo cp /home/Amaan/Downloads/Input.txt /home/Amaan2/Downloads/Input.txt```

> Change the ownership of the moved file ti new user
```sudo chown Amaan2:Amaan2 /home/Amaan2/Downloads/Input.txt```

> Show all the directories and files in the folder, Here this command shows all the files and directories in the home folder
```home~$ ls```

> Download any package by its url using terminal 
```wget <url_of_package>```

> Useradd is used to create a new user, while passwd is adding a password to that user’s account.
```useradd AmaanKhan```
```passwd 123456```

> Pwd is used to get absolute path of the current directory opened in terminal
```pwd```

> Mkdir is used to create a new folder/directory
```mkdir folder_name```

> To print a variable
```echo $variable_name```. 

> To print network information.
```ifconfig```. 

> To print or set hostname.
```hostname```. 

> To remove a empty directory.
```rmdir```. 

> To create a file.
```touch```


> Copy file from host machine to remote server
```scp <filename> <remote host user>@<remote host IP>:<remote host path> Example usage: sudo scp input.txt root@192.168.1.1:~/```

> Used to change mode of file
```chmod xwr```
> Used to change mode of file
```chmod xwr```



