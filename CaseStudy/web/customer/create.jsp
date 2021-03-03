<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 25/12/2020
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <link rel="stylesheet" href="Request_customer.css">
    <script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<div id="post">
    <h3 style="text-align: center; font-size: 30px">CUSTOMER INFORMATION</h3>
    <form id="inputCustomer">
        <table>
            <tr>
                <td>Full name:</td>
                <td><input onblur="checkX(fullName)" id="inName" type="text"></td>
            </tr>
            <tr>
                <td>Identify card:</td>
                <td><input onkeydown="limitMaxText(this, 8); return isNumberKey(this)"
                           onkeyup="limitMaxText(this, 8)" onblur="limitMinText(this, 0)" id="inIdCard" type="text">
                </td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td><input id="inBirth" type="date"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input onblur="checkEmail()" id="inEmail" type="text"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input onblur="checkX(address)" id="inAddress" type="text"></td>
            </tr>
            <tr>
                <td>Customer type:</td>
                <td>
                    <label>
                        <select id="inCustomer">
                            <option value="Diamond">Diamond</option>
                            <option value="Platinum">Platinum</option>
                            <option value="Gold">Gold</option>
                            <option value="Silver">Silver</option>
                            <option value="Member">Member</option>
                        </select>
                    </label>
                </td>
            </tr>
            <tr>
                <td>Discount:</td>
                <td><input id="inDiscount" type="text"></td>
            </tr>
            <tr>
                <td>Quantity included:</td>
                <td><input onkeydown="return isNumberKey(this)" id="inQuantity" type="text"></td>
            </tr>
            <tr>
                <td>Rent day(s):</td>
                <td><input onkeydown="return isNumberKey(this)" id="inRentDay" type="text"></td>
            </tr>
            <tr>
                <td>Type of service:</td>
                <td>
                    <label>
                        <select id="inService">
                            <option value="Villa ($500/day)">Villa ($500/day)</option>
                            <option value="House ($300/day)">House ($300/day)</option>
                            <option value="Room ($100/day)">Room ($100/day)</option>
                        </select>
                    </label>
                </td>
            </tr>
            <tr>
                <td>Type of room:</td>
                <td>
                    <label>
                        <select id="inRoom">
                            <option value="Vip">Vip</option>
                            <option value="Business">Business</option>
                            <option value="Normal">Normal</option>
                        </select>
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    <button type="button" onclick="checkData(); total(); checkBirth()" value="accept">Accept
                    </button>
                </td>
                <td>
                    <button type="reset" id="reset" value="reset">Reset</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
<script src="Request_customer.js"></script>
</html>
