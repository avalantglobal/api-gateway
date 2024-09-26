"use strict";(this.webpackChunk_wso2apim_devportal=this.webpackChunk_wso2apim_devportal||[]).push([[5320],{355320:(e,t,r)=>{r.r(t),r.d(t,{default:()=>R});var a=r(811504),s=r(906940),n=r(404292),o=r(669872),c=r(219811),d=r.n(c),i=r(770268),l=r.n(i),m=r(991568),p=r(715656),w=r(902706),u=r(622037),g=r(162248),h=r(924004),f=r(203268),P=r.n(f);const E="ChangePasswordBase",y={createTitle:`${E}-createTitle`,formContent:`${E}-formContent`},C=(0,s.cp)(m.c)((e=>{let{theme:t}=e;return{[`& .${y.createTitle}`]:{color:t.palette.getContrastText(t.palette.background.default)},[`& .${y.formContent}`]:{"& span, & div, & p, & input":{color:t.palette.getContrastText(t.palette.background.paper)}}}}));function v(e){const{title:t,children:r}=e;return a.createElement(C,{width:1,mt:5},a.createElement(p.cp,{justifyContent:"center",container:!0,spacing:3},a.createElement(p.cp,{item:!0,sm:6,md:4},a.createElement(p.cp,{container:!0,spacing:4},a.createElement(p.cp,{item:!0,md:12,className:y.createTitle},t),a.createElement(p.cp,{item:!0,md:12,className:y.formContent},a.createElement(h.c,{elevation:0},r))))))}v.propTypes={title:P().element.isRequired,children:P().element.isRequired};const b=v;var x=r(699084),M=r(273384),S=r(141776),O=r(403972),T=r(209176);function j(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,a)}return r}function k(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?j(Object(r),!0).forEach((function(t){var a,s,n,o;a=e,s=t,n=r[t],(s="symbol"==typeof(o=function(e,t){if("object"!=typeof e||!e)return e;var r=e[Symbol.toPrimitive];if(void 0!==r){var a=r.call(e,"string");if("object"!=typeof a)return a;throw new TypeError("@@toPrimitive must return a primitive value.")}return String(e)}(s))?o:String(o))in a?Object.defineProperty(a,s,{value:n,enumerable:!0,configurable:!0,writable:!0}):a[s]=n})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):j(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}const F="ChangePassword",N={mandatoryStarText:`${F}-mandatoryStarText`,passwordChangeForm:`${F}-passwordChangeForm`},$=(0,s.cp)(b)((e=>{let{theme:t}=e;return{[`& .${N.mandatoryStarText}`]:{"& label>span:nth-child(1)":{color:"red"}},[`& .${N.passwordChangeForm}`]:{"& > span, & div, & p, & input":{color:t.palette.getContrastText(t.palette.primary.main)}}}}));function q(e,t){let{field:r,value:a}=t;return k(k({},e),{},{[r]:a})}const R=()=>{const{settings:{IsPasswordChangeEnabled:e,userStorePasswordPattern:t,passwordPolicyPattern:r,passwordPolicyMinLength:s,passwordPolicyMaxLength:c}}=(0,T.k1)(),i=o.c.getUser().name,[h,f]=(0,a.useReducer)(q,{currentPassword:void 0,newPassword:void 0,repeatedNewPassword:void 0}),{currentPassword:P,newPassword:E,repeatedNewPassword:y}=h,C=d().passwordChange.guidelinesEnabled;let v=[];C&&(v=d().passwordChange.policyList);const b=()=>{let e=l().string().empty();s&&-1!==s&&(e=e.min(s)),c&&-1!==c&&(e=e.max(c));const o=e.validate(E).error;if(o){const e=o.details[0].type;if("string.empty"===e)return a.createElement(n.c,{id:"Change.Password.password.empty",defaultMessage:"Password is empty"});if("string.min"===e)return a.createElement(n.c,{id:"Change.Password.password.length.short",defaultMessage:"Password is too short!"});if("string.max"===e)return a.createElement(n.c,{id:"Change.Password.password.length.long",defaultMessage:"Password is too long!"})}if(t){const e=l().string().pattern(new RegExp(t)).validate(E).error;if(e&&"string.pattern.base"===e.details[0].type)return a.createElement(n.c,{id:"Change.Password.password.pattern.invalid",defaultMessage:"Invalid password pattern"})}if(r){const e=l().string().pattern(new RegExp(r)).validate(E).error;if(e&&"string.pattern.base"===e.details[0].type)return a.createElement(n.c,{id:"Change.Password.password.pattern.invalid",defaultMessage:"Invalid password pattern"})}return!1},j=()=>{if(y&&E!==y)return a.createElement(n.c,{id:"Change.Password.password.mismatch",defaultMessage:"Password doesn't match"})},k=e=>{let{target:{name:t,value:r}}=e;f({field:t,value:r})},F=a.createElement(a.Fragment,null,a.createElement(g.c,{variant:"h5",component:"h1"},a.createElement(n.c,{id:"Change.Password.title",defaultMessage:"Change Password"}),": "+i),a.createElement(g.c,{variant:"caption"},a.createElement(n.c,{id:"Change.Password.description",defaultMessage:"Change your own password. Required fields are marked with an asterisk ( * )"})),C&&v.length>0?a.createElement(g.c,{variant:"body2"},a.createElement(n.c,{id:"Change.Password.password.policy",defaultMessage:"Password policy:"}),a.createElement("ul",{style:{marginTop:"-4px",marginBottom:"-8px"}},v.map((e=>a.createElement("li",null,e))))):null);return void 0===e?a.createElement(O.c,null):e?a.createElement($,{title:F},a.createElement(m.c,{py:2,display:"flex",justifyContent:"center"},a.createElement(p.cp,{item:!0,xs:10,md:9},a.createElement(m.c,{component:"div",m:2},a.createElement(p.cp,{container:!0,mt:2,spacing:2,direction:"column",justifyContent:"center",alignItems:"flex-start"},a.createElement(u.c,{classes:{root:N.mandatoryStarText},required:!0,id:"current-password",autoFocus:!0,margin:"dense",name:"currentPassword",value:P,onChange:k,label:a.createElement(n.c,{id:"Settings.ChangePasswordForm.current.password",defaultMessage:"Current Password"}),fullWidth:!0,error:""===P,helperText:a.createElement(n.c,{id:"Settings.ChangePasswordForm.enter.current.password",defaultMessage:"Enter Current Password"}),variant:"outlined",type:"password"}),a.createElement(u.c,{classes:{root:N.mandatoryStarText},margin:"dense",id:"new-password",name:"newPassword",value:E,onChange:k,label:a.createElement(n.c,{id:"Settings.ChangePasswordForm.new.password",defaultMessage:"New Password"}),required:!0,fullWidth:!0,error:b(),helperText:b()||a.createElement(n.c,{id:"Settings.ChangePasswordForm.enter.new.password",defaultMessage:"Enter a New Password"}),variant:"outlined",type:"password"}),a.createElement(u.c,{classes:{root:N.mandatoryStarText},margin:"dense",id:"repeated-new-password",name:"repeatedNewPassword",value:y,onChange:k,label:a.createElement(n.c,{id:"Settings.ChangePasswordForm.confirm.new.password",defaultMessage:"Confirm new Password"}),required:!0,fullWidth:!0,error:j(),helperText:j()||a.createElement(n.c,{id:"Settings.ChangePasswordForm.confirmationOf.new.password",defaultMessage:"Confirmation of new Password"}),variant:"outlined",type:"password"}),a.createElement(m.c,{my:2,display:"flex",flexDirection:"row"},a.createElement(m.c,{mr:1},a.createElement(w.c,{color:"primary",variant:"contained",onClick:()=>{if(!y||E===y)return(new M.c).changePassword(P,E).then((e=>{S.c.success(a.createElement(n.c,{id:"Change.Password.password.changed.success",defaultMessage:"User password changed successfully. Please use the new password on next sign in"})),window.history.back()})).catch((e=>{switch(e.response.body.code){case 901450:S.c.error(a.createElement(n.c,{id:"Change.Password.password.change.disabled",defaultMessage:"Password change disabled"}));break;case 901451:S.c.error(a.createElement(n.c,{id:"Change.Password.current.password.incorrect",defaultMessage:"Current password is incorrect"}));break;case 901452:S.c.error(a.createElement(n.c,{id:"Change.Password.password.pattern.invalid",defaultMessage:"Invalid password pattern"}))}}));S.c.error(a.createElement(n.c,{id:"Change.Password.password.mismatch",defaultMessage:"Password doesn't match"}))},className:N.passwordChangeForm},a.createElement(n.c,{id:"Settings.ChangePasswordForm.Save.Button.text",defaultMessage:"Save"}))),a.createElement(m.c,{mx:1},a.createElement(w.c,{onClick:()=>window.history.back()},a.createElement(n.c,{id:"Settings.ChangePasswordForm.Cancel.Button.text",defaultMessage:"Cancel"}))))))))):a.createElement(x.c,null)}}}]);
//# sourceMappingURL=5320.2cfd0e5357500ab8a4f7.bundle.js.map