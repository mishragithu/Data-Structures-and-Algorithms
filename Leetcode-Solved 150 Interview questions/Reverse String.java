class Solution {
public:
    string reverseWords(string s) {
        int len=s.size()-1;
        string temp="";
        string ans="";
        for(int i=len;i>=0;i--){
            if(s[i]==' ' && temp!=""){
                reverse(temp.begin(),temp.end());
                ans+=temp+' ';
                temp="";
            }
            else{
                if(s[i]==' ')   continue;
                temp+=s[i];
            }
        }
        reverse(temp.begin(),temp.end());
        ans+=temp;
        if(ans[ans.size()-1]==' ')
            //ans=ans.erase(ans.size()-1);
            ans.pop_back();
        return ans;
    }
};
