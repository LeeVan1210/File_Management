# File_Management
FileIO Project
this is my School project 
and if someone could see and help me, ill be glad
// one issue is i cant write to file if i put space to the content

System.out.print("Enter File Name: ");
        fileName = in.next();
        Path filePath = Paths.get("C:\\Users\\Public\\Documents\\"+fileName+".txt");
        try{
            Path createFile = Files.createFile(filePath);
            System.out.println("File Created "+createFile);

            System.out.print("Write to File? \n [1]Yes [2]No \n::");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Write Content: \n");
                    fileWrite = in.next();
                    String content = fileWrite;
                    byte[] bs = content.getBytes();
                    Path writtenPath = Files.write(filePath, bs);
                    System.out.println("Content Written in file\n"+ new String(Files.readAllBytes(writtenPath))+".txt");
                    break;
                case 2:
                    break;
            }
        }catch(IOException e){
        }
    }
