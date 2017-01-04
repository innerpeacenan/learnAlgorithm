

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
 
public class TreeNode implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int parentId;
    private int selfId;
    protected String nodeName;
    protected Object obj;
    protected TreeNode parentNode;
    protected List<TreeNode> childList;
 
    public TreeNode() {
        initChildList();
    }
 
    public TreeNode(TreeNode parentNode) {
        this.getParentNode();
        initChildList();
    }
 
    public boolean isLeaf() {
        if (childList == null) {
            return true;
        } else {
            if (childList.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
 
    public void addChildNode(TreeNode treeNode) {
        initChildList();
        childList.add(treeNode);
    }
 
    public void initChildList() {
        if (childList == null)
            childList = new ArrayList<TreeNode>();
    }
 
    public boolean isValidTree() {
        return true;
    }
 
    public List<TreeNode> getElders() {
        List<TreeNode> elderList = new ArrayList<TreeNode>();
        TreeNode parentNode = this.getParentNode();
        if (parentNode == null) {
            return elderList;
        } else {
            elderList.add(parentNode);
            elderList.addAll(parentNode.getElders());
            return elderList;
        }
    }
 
    public List<TreeNode> getJuniors() {
        List<TreeNode> juniorList = new ArrayList<TreeNode>();
        List<TreeNode> childList = this.getChildList();
        if (childList == null) {
            return juniorList;
        } else {
            int childNumber = childList.size();
            for (int i = 0; i < childNumber; i++) {
                TreeNode junior = childList.get(i);
                juniorList.add(junior);
                juniorList.addAll(junior.getJuniors());
            }
            return juniorList;
        }
    }
 
    public List<TreeNode> getChildList() {
        return childList;
    }
 
    public void deleteNode() {
        TreeNode parentNode = this.getParentNode();
        int id = this.getSelfId();
 
        if (parentNode != null) {
            parentNode.deleteChildNode(id);
        }
    }
 
    public void deleteChildNode(int childId) {
        List<TreeNode> childList = this.getChildList();
        int childNumber = childList.size();
        for (int i = 0; i < childNumber; i++) {
            TreeNode child = childList.get(i);
            if (child.getSelfId() == childId) {
                childList.remove(i);
                return;
            }
        }
    }
 
    public boolean insertJuniorNode(TreeNode treeNode) {
        int juniorParentId = treeNode.getParentId();
        if (this.parentId == juniorParentId) {
            addChildNode(treeNode);
            return true;
        } else {
            List<TreeNode> childList = this.getChildList();
            int childNumber = childList.size();
            boolean insertFlag;
 
            for (int i = 0; i < childNumber; i++) {
                TreeNode childNode = childList.get(i);
                insertFlag = childNode.insertJuniorNode(treeNode);
                if (insertFlag == true)
                    return true;
            }
            return false;
        }
    }
 
    public TreeNode findTreeNodeById(int id) {
        if (this.selfId == id)
            return this;
        if (childList.isEmpty() || childList == null) {
            return null;
        } else {
            int childNumber = childList.size();
            for (int i = 0; i < childNumber; i++) {
                TreeNode child = childList.get(i);
                TreeNode resultNode = child.findTreeNodeById(id);
                if (resultNode != null) {
                    return resultNode;
                }
            }
            return null;
        }
    }
 
    public void traverse() {
        if (selfId < 0)
            return;
        print(this.selfId);
        if (childList == null || childList.isEmpty())
            return;
        int childNumber = childList.size();
        for (int i = 0; i < childNumber; i++) {
            TreeNode child = childList.get(i);
            child.traverse();
        }
    }
 
    public void print(String content) {
        System.out.println(content);
    }
 
    public void print(int content) {
        System.out.println(String.valueOf(content));
    }
 
    public void setChildList(List<TreeNode> childList) {
        this.childList = childList;
    }
 
    public int getParentId() {
        return parentId;
    }
 
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
 
    public int getSelfId() {
        return selfId;
    }
 
    public void setSelfId(int selfId) {
        this.selfId = selfId;
    }
 
    public TreeNode getParentNode() {
        return parentNode;
    }
 
    public void setParentNode(TreeNode parentNode) {
        this.parentNode = parentNode;
    }
 
    public String getNodeName() {
        return nodeName;
    }
 
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
 
    public Object getObj() {
        return obj;
    }
 
    public void setObj(Object obj) {
        this.obj = obj;
    }
}
