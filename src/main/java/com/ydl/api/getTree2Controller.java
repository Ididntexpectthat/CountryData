package com.ydl.api;


import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.Introduce;
import com.ydl.entity.Tree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.util.*;
//项目后端采用springboot框架
@Controller
public class getTree2Controller {
    List <Tree>node=new LinkedList();
    @ResponseBody
    @RequestMapping("/file")
    public List<Tree> file(@RequestParam("name")String name, @RequestBody Map<String,Object> models) throws Exception {
//        Introduce introduce = JsonXMLUtils.map2obj((Map<String,Object>)models.get("Introduce"),Introduce.class);
//        System.out.println(introduce.getZm());
        node.removeAll(node);
        String path="D:\\code\\upload\\files"+File.separator+name;
        int level=0;
        List<Tree>file=getFile(path,1,level);
        return file;
    }
    private  List<Tree> getFile(String path,int id,int pid) {
        File file = new File(path);
        if(file.exists()) {
            File[] array = file.listFiles();
            List fileList = Arrays.asList(array);
            //对读到的本地文件夹进行排序
            Collections.sort(fileList, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    if (o1.isDirectory() && o2.isFile())
                        return -1;
                    if (o1.isFile() && o2.isDirectory())
                        return 1;
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (int i = 0; i < array.length; i++) {
                Tree tree = new Tree();
                tree.setPid(pid);
                tree.setId(id);
                tree.setName(array[i].getName());
                //判断是否为文件夹，是的话进行递归
                if (array[i].isDirectory()) {
                    node.add(tree);
                    //进行递归，此时的pid为上一级的id
                    getFile(array[i].getPath(), id * 10 + 1 + i, id);
                    id++;
                } else {
                    node.add(tree);
                    id++;
                }
            }
        }
        else
        {
            System.out.println("文件不存在");
        }
        return node;
    }
}

