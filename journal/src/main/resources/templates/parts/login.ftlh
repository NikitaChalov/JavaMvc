<#macro login path isRegisterForm>
    <form action="${path}" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Имя пользователя : </label>
            <div class="col-sm-4">
                <input type="text" name="username" class="form-control" placeholder="Введите имя пользователя" />
                <input type="hidden" name="_csrf" value="${_csrf.token}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Пароль: </label>
            <div class="col-sm-4" >
                <input type="password" name="password" class="form-control" placeholder="Введите пароль" />
                <input type="hidden" name="_csrf" value="${_csrf.token}">
            </div>
        </div>

        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <div class="form-group row">
            <div class="col-sm-2">
                <#if !isRegisterForm><a href="registration">Добавить пользователя</a></#if>
            </div>
            <div class="ml-3">
                <button class="btn btn-primary" type="submit"><#if isRegisterForm>Создать<#else>Войти</#if></button>
            </div>
        </div>
    </form>
</#macro>
<#macro logout>
    <div>
        <form action="/logout" method="post">
            <button class="btn btn-primary" type="submit" >Sign Out</button>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
        </form>
    </div>
</#macro>
