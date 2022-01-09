/* =============================================================
 * SmallSQL : a free Java DBMS library for the Java(tm) platform
 * =============================================================
 *
 * (C) Copyright 2004-2007, by Volker Berlin.
 *
 * Project Info:  http://www.smallsql.de/
 *
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by 
 * the Free Software Foundation; either version 2.1 of the License, or 
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, 
 * USA.  
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * ---------------
 * SSCallableStatament.java
 * ---------------
 * Author: Volker Berlin
 * 
 */
package smallsql.database;

import java.sql.*;
import java.math.*;
import java.util.Map;
import java.util.Calendar;
import java.net.URL;
import java.io.*;

import smallsql.database.language.Language;

public class SSCallableStatement extends SSPreparedStatement implements CallableStatement {

    private boolean wasNull;

    SSCallableStatement( SSConnection con, String sql ) throws SQLException {
        super( con, sql );
    }

    SSCallableStatement( SSConnection con, String sql, int rsType, int rsConcurrency ) throws SQLException {
        super( con, sql, rsType, rsConcurrency );
    }

    private Expression getValue(int i) throws SQLException{
System.out.println(new Throwable().getStackTrace()[0]);
throw new java.lang.UnsupportedOperationException("Method getValue() not yet implemented.");
}

    private int findParameter( String parameterName ){
System.out.println(new Throwable().getStackTrace()[0]);
throw new java.lang.UnsupportedOperationException("Method findParameter() not yet implemented.");
}
/*==============================================================================

    Public Interface

==============================================================================*/
    public void registerOutParameter(int i, int sqlType) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw new java.lang.UnsupportedOperationException("Method registerOutParameter() not yet implemented.");
}
    public void registerOutParameter(int i, int sqlType, int scale) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw new java.lang.UnsupportedOperationException("Method registerOutParameter() not yet implemented.");
}
    
    
    public boolean wasNull(){
System.out.println(new Throwable().getStackTrace()[0]);
return wasNull;
}
    
    
    public String getString(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            String obj = getValue(i).getString();
            wasNull = obj == null;
            return obj;
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public boolean getBoolean(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Expression expr = getValue(i);
            wasNull = expr.isNull();
            return expr.getBoolean();
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public byte getByte(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return (byte)getInt( i );
}
    public short getShort(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return (byte)getInt( i );
}
    public int getInt(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Expression expr = getValue(i);
            wasNull = expr.isNull();
            return expr.getInt();
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public long getLong(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Expression expr = getValue(i);
            wasNull = expr.isNull();
            return expr.getLong();
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public float getFloat(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Expression expr = getValue(i);
            wasNull = expr.isNull();
            return expr.getFloat();
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public double getDouble(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Expression expr = getValue(i);
            wasNull = expr.isNull();
            return expr.getLong();
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public BigDecimal getBigDecimal(int i, int scale) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            MutableNumeric obj = getValue(i).getNumeric();
            wasNull = obj == null;
            if(wasNull) return null;
            return obj.toBigDecimal(scale);
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public byte[] getBytes(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            byte[] obj = getValue(i).getBytes();
            wasNull = obj == null;
            return obj;
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public Date getDate(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
			Expression expr = getValue(i);
            wasNull = expr.isNull();
			if(wasNull) return null;
			return DateTime.getDate( expr.getLong() );
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public Time getTime(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
			Expression expr = getValue(i);
            wasNull = expr.isNull();
			if(wasNull) return null;
			return DateTime.getTime( expr.getLong() );
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public Timestamp getTimestamp(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Expression expr = getValue(i);
            wasNull = expr.isNull();
            if(wasNull) return null;
            return DateTime.getTimestamp( expr.getLong() );
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public Object getObject(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            Object obj = getValue(i).getObject();
            wasNull = obj == null;
            return obj;
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    public BigDecimal getBigDecimal(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
try{
            MutableNumeric obj = getValue(i).getNumeric();
            wasNull = obj == null;
            if(wasNull) return null;
            return obj.toBigDecimal();
        }catch(Exception e){
            throw SmallSQLException.createFromException( e );
        }
}
    //public Object getObject(int i, Map map) throws SQLException {
    //    /**@todo: Implement this java.sql.CallableStatement method*/
    //    throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getObject() not yet implemented.");
    //}
    public Ref getRef(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getRef() not yet implemented.");
}
    public Blob getBlob(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getBlob() not yet implemented.");
}
    public Clob getClob(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getClob() not yet implemented.");
}
    public Array getArray(int i) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getArray() not yet implemented.");
}
    public Date getDate(int i, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getDate() not yet implemented.");
}
    public Time getTime(int i, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getTime() not yet implemented.");
}
    public Timestamp getTimestamp(int i, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getTimestamp() not yet implemented.");
}
    public void registerOutParameter(int i, int sqlType, String typeName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method registerOutParameter() not yet implemented.");
}
    public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
registerOutParameter( findParameter( parameterName ), sqlType );
}
    public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
registerOutParameter( findParameter( parameterName ), sqlType, scale );
}
    public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
registerOutParameter( findParameter( parameterName ), sqlType, typeName );
}
    public URL getURL(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
throw SmallSQLException.create(Language.UNSUPPORTED_OPERATION, "Method getURL() not yet implemented.");
}
    public void setURL(String parameterName, URL x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setURL( findParameter( parameterName ), x );
}
    public void setNull(String parameterName, int sqlType) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setNull( findParameter( parameterName ), sqlType );
}
    public void setBoolean(String parameterName, boolean x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setBoolean( findParameter( parameterName ), x );
}
    public void setByte(String parameterName, byte x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setByte( findParameter( parameterName ), x );
}
    public void setShort(String parameterName, short x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setShort( findParameter( parameterName ), x );
}
    public void setInt(String parameterName, int x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setInt( findParameter( parameterName ), x );
}
    public void setLong(String parameterName, long x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setLong( findParameter( parameterName ), x );
}
    public void setFloat(String parameterName, float x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setFloat( findParameter( parameterName ), x );
}
    public void setDouble(String parameterName, double x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setDouble( findParameter( parameterName ), x );
}
    public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setBigDecimal( findParameter( parameterName ), x );
}
    public void setString(String parameterName, String x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setString( findParameter( parameterName ), x );
}
    public void setBytes(String parameterName, byte[] x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setBytes( findParameter( parameterName ), x );
}
    public void setDate(String parameterName, Date x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setDate( findParameter( parameterName ), x );
}
    public void setTime(String parameterName, Time x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setTime( findParameter( parameterName ), x );
}
    public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setTimestamp( findParameter( parameterName ), x );
}
    public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setAsciiStream( findParameter( parameterName ), x, length );
}
    public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setBinaryStream( findParameter( parameterName ), x, length );
}
    public void setObject(String parameterName, Object x, int sqlType, int scale) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setObject( findParameter( parameterName ), x, sqlType, scale );
}
    public void setObject(String parameterName, Object x, int sqlType) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setObject( findParameter( parameterName ), x, sqlType );
}
    public void setObject(String parameterName, Object x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setObject( findParameter( parameterName ), x );
}
    public void setCharacterStream(String parameterName, Reader x, int length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setCharacterStream( findParameter( parameterName ), x, length );
}
    public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setDate( findParameter( parameterName ), x, cal );
}
    public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setTime( findParameter( parameterName ), x, cal );
}
    public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setTimestamp( findParameter( parameterName ), x, cal );
}
    public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
setNull( findParameter( parameterName ), sqlType, typeName );
}
    public String getString(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getString( findParameter( parameterName ) );
}
    public boolean getBoolean(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getBoolean( findParameter( parameterName ) );
}
    public byte getByte(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getByte( findParameter( parameterName ) );
}
    public short getShort(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getShort( findParameter( parameterName ) );
}
    public int getInt(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getInt( findParameter( parameterName ) );
}
    public long getLong(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getLong( findParameter( parameterName ) );
}
    public float getFloat(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getFloat( findParameter( parameterName ) );
}
    public double getDouble(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getDouble( findParameter( parameterName ) );
}
    public byte[] getBytes(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getBytes( findParameter( parameterName ) );
}
    public Date getDate(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getDate( findParameter( parameterName ) );
}
    public Time getTime(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getTime( findParameter( parameterName ) );
}
    public Timestamp getTimestamp(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getTimestamp( findParameter( parameterName ) );
}
    public Object getObject(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getObject( findParameter( parameterName ) );
}
    public BigDecimal getBigDecimal(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getBigDecimal( findParameter( parameterName ) );
}
    //public Object getObject(String parameterName, Map map) throws SQLException {
    //    return getObject( findParameter( parameterName ), map );
    //}
    public Ref getRef(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getRef( findParameter( parameterName ) );
}
    public Blob getBlob(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getBlob( findParameter( parameterName ) );
}
    public Clob getClob(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getClob( findParameter( parameterName ) );
}
    public Array getArray(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getArray( findParameter( parameterName ) );
}
    public Date getDate(String parameterName, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getDate( findParameter( parameterName ), cal );
}
    public Time getTime(String parameterName, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getTime( findParameter( parameterName ), cal );
}
    public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getTimestamp( findParameter( parameterName ), cal );
}
    public URL getURL(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return getURL( findParameter( parameterName ) );
}

	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNString(int parameterIndex, String value)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value,
			long length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setClob(int parameterIndex, Reader reader, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNClob(int parameterIndex, Reader reader, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader,
			long length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public boolean isClosed() throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return false;
}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public boolean isPoolable() throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return false;
}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return false;
}

	@Override
	public Object getObject(int parameterIndex, Map<String, Class<?>> map)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public Object getObject(String parameterName, Map<String, Class<?>> map)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public RowId getRowId(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public RowId getRowId(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public void setRowId(String parameterName, RowId x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNString(String parameterName, String value)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNCharacterStream(String parameterName, Reader value,
			long length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNClob(String parameterName, NClob value) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setClob(String parameterName, Reader reader, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBlob(String parameterName, InputStream inputStream,
			long length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNClob(String parameterName, Reader reader, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public NClob getNClob(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public NClob getNClob(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public void setSQLXML(String parameterName, SQLXML xmlObject)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public SQLXML getSQLXML(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public SQLXML getSQLXML(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public String getNString(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public String getNString(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public Reader getNCharacterStream(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public Reader getNCharacterStream(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public Reader getCharacterStream(int parameterIndex) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public Reader getCharacterStream(String parameterName) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
return null;
}

	@Override
	public void setBlob(String parameterName, Blob x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setClob(String parameterName, Clob x) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, long length)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setCharacterStream(String parameterName, Reader reader,
			long length) throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setAsciiStream(String parameterName, InputStream x)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBinaryStream(String parameterName, InputStream x)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setCharacterStream(String parameterName, Reader reader)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNCharacterStream(String parameterName, Reader value)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setClob(String parameterName, Reader reader)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setBlob(String parameterName, InputStream inputStream)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}

	@Override
	public void setNClob(String parameterName, Reader reader)
			throws SQLException {
System.out.println(new Throwable().getStackTrace()[0]);
}
}